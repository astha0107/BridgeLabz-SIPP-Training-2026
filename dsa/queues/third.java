package dsa.queues;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int priority;  

    Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    @Override
    public int compareTo(Patient other) {
        return this.priority - other.priority;
    }
}
public class third {

    public static void main(String[] args) {

        PriorityQueue<Patient> erQueue = new PriorityQueue<>();

        erQueue.add(new Patient("John", 3));
        erQueue.add(new Patient("Alice", 1));
        erQueue.add(new Patient("Bob", 4));
        erQueue.add(new Patient("Emma", 2));
        erQueue.add(new Patient("David", 5));

        System.out.println("Patients are treated in this order:\n");

        while (!erQueue.isEmpty()) {
            Patient p = erQueue.poll();   
            System.out.println(
                "Treating: " + p.name +
                " (Priority " + p.priority + ")"
            );
        }
    }
}
