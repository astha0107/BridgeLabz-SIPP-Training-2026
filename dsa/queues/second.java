package dsa.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class second {

    public static void main(String[] args) {
        Deque<String> printQueue = new ArrayDeque<>();
        printQueue.addLast("Document_A");
        printQueue.addLast("Document_B");
        printQueue.addLast("Document_C");
        printQueue.addFirst("Urgent_Report");
        System.out.println("Current Print Queue:");
        System.out.println(printQueue);

        System.out.println("\nPrinting: " + printQueue.removeFirst());
        System.out.println("Printing: " + printQueue.removeFirst());

        printQueue.addFirst("Emergency_File");
        printQueue.addLast("Document_D");

        System.out.println("\nUpdated Print Queue:");
        System.out.println(printQueue);

        System.out.println("\nRemaining Jobs:");

        while (!printQueue.isEmpty()) {
            System.out.println("Printing: " + printQueue.removeFirst());
        }
    }
}
