//swap nth nodes from start and from end
package LinkedList;

class LinkedList2 {
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

    // swap nth node from first and last
    public void swapNodes(int n) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            System.out.println("Atleast two nodes needed for swapping!");
            return;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        Node prevNode = dummy;
        Node nextNode = dummy;
        for (int i = 0; i < n; i++) {
            nextNode = nextNode.next;
        }

        while (nextNode != null) {
            nextNode = nextNode.next;
            prevNode = prevNode.next;
        }

        Node currNode = head;
        for (int j = 1; j < n; j++) {
            currNode = currNode.next;
        }
        int temp = currNode.val;
        currNode.val = prevNode.val;
        prevNode.val = temp;
    }

    // print list
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.printList();

        list.swapNodes(3);
        list.printList();
    }
}
