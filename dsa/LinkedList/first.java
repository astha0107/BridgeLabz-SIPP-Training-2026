package dsa.LinkedList;

class Node {
    String track;
    Node next;

    Node(String track) {
        this.track = track;
        this.next = null;
    }
}
class first{
    public static void insertAfter(Node current, String newTrack) {
        if (current == null) {
            return;
        }
        Node newNode = new Node(newTrack);
        newNode.next = current.next;
        current.next = newNode;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.track + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node("Song A");
        head.next = new Node("Song B");
        head.next.next = new Node("Song C");
        System.out.println("Before Insertion:");
        printList(head);
        insertAfter(head, "New Song");
        System.out.println("After Insertion:");
        printList(head);
    }
}
