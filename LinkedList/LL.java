package LinkedList;

class LL {
    private Node head;
    private int size;

    LL() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++; // Increments size when a new node is created
        }
    }

    // Add element to the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add element to the end
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        // Attach the new node at the end
        currNode.next = newNode;
    }

    // Delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return; // Return immediately if list is empty
        }
        head = head.next;
        size--; // Decrease size after removing the first node
    }

    // Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return; // Return immediately if list is empty
        }

        // If the list only has one node
        if (head.next == null) {
            head = null;
            size--; // Decrease size for the last remaining node
            return;
        }

        // Traverse to the second last node
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        secondLastNode.next = null; // Remove reference to the last node
        size--; // Decrease size after removing the last node
    }

    // Print the list
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Display the size of the list
    public void printSize() {
        System.out.println("Size of the list: " + size);
    }

    public static void main(String[] args) {
        LL list = new LL();

        // Adding elements to the list
        list.addFirst("am");
        list.addFirst("I");
        list.addLast("Soumik");
        list.printList(); // Output: I -> am -> Soumik -> null

        // Deleting the first node
        System.out.println();
        list.deleteFirst();
        list.printList(); // Output: am -> Soumik -> null

        // Deleting the last node
        System.out.println();
        list.deleteLast();
        list.printList(); // Output: am -> null

        // Printing the size of the list
        System.out.println();
        list.printSize(); // Output: Size of the list: 1
    }
}
