package LinkedList;

class NewLinkedList {
    private Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // add last
    public void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // swap pair of nodes
    public void swapPairNodes() {
        if (head == null || head.next == null) {
            System.out.println("Atleast two nodes needed for the swapping.");
        }

        Node currNode = head;
        while (currNode != null && currNode.next != null) {
            int temp = currNode.val;
            currNode.val = currNode.next.val;
            currNode.next.val = temp;

            // two step forward
            currNode = currNode.next.next;
        }

    }

    // print the list
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        NewLinkedList list = new NewLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();
        list.swapPairNodes();
        list.printList();
    }
}
