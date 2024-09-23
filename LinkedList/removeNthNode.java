package LinkedList;

class LinkedList {
    private Node head;
    private int size;

    LinkedList() {
        size = 0;
    }

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
            size++;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        size++;
    }

    // remove nth node from last
    public void removeNthNode(int n) {
        if (head == null) {
            System.out.println("Nothing to remove!");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        if (size == n) {
            head = head.next;
            size--;
            return;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        Node prevNode = dummy;
        Node nextNode = dummy;

        for (int i = 0; i <= n; i++) {
            nextNode = nextNode.next;
        }

        while (nextNode != null) {
            nextNode = nextNode.next;
            prevNode = prevNode.next;
        }
        prevNode.next = prevNode.next.next;
        size--;
    }

    // print the list
    public void printList() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.val + " -> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    // print size
    public void printSize() {
        System.out.println("List size - " + size);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();
        list.removeNthNode(2);
        list.printList();
        list.printSize();
    }
}
