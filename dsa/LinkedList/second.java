package dsa.LinkedList;

class Node {
    int id;
    Node next;

    Node(int id) {
        this.id = id;
        this.next = null;
    }
}
class second {
    public static Node deleteNode(Node head, int key) {
        if (head != null && head.id == key) {
            return head.next;
        }
        Node prev = null;
        Node curr = head;
        while (curr != null && curr.id != key) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        prev.next = curr.next;
        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.id + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);
        System.out.println("Before Deletion:");
        printList(head);
        head = deleteNode(head, 103);
        System.out.println("After Deletion:");
        printList(head);
    }
}
