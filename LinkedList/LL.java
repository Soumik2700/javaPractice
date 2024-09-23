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

    // reverse with iteration
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // reverse with recursion
    public Node reverseRecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
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

        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");

        list.printList();
        System.out.println();
        list.head = list.reverseRecursion(list.head);
        System.out.println();
        list.printList();

    }
}
