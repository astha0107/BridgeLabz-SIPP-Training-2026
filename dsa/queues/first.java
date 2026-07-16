package dsa.queues;

class CircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int count;
    private int capacity;

    // Constructor
    CircularQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = 0;
        count = 0;
    }

    // Enqueue (Packet Arrives)
    public void enqueue(int packet) {

        if (count == capacity) {
            System.out.println("Buffer Full! Packet " + packet + " rejected.");
            return;
        }

        queue[rear] = packet;
        rear = (rear + 1) % capacity;
        count++;

        System.out.println("Packet " + packet + " added.");
    }

    // Dequeue (Packet Processed)
    public int dequeue() {

        if (count == 0) {
            System.out.println("Buffer Empty!");
            return -1;
        }

        int packet = queue[front];
        front = (front + 1) % capacity;
        count--;

        return packet;
    }

    // Peek Front Packet
    public int peek() {
        if (count == 0) {
            System.out.println("Buffer Empty!");
            return -1;
        }
        return queue[front];
    }

    // Check Empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Check Full
    public boolean isFull() {
        return count == capacity;
    }

    // Display Queue
    public void display() {

        if (count == 0) {
            System.out.println("Buffer Empty!");
            return;
        }

        System.out.print("Buffer: ");

        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }

        System.out.println();
    }
}

public class first{
    public static void main(String[] args) {
        CircularQueue buffer = new CircularQueue(5);
        buffer.enqueue(101);
        buffer.enqueue(102);
        buffer.enqueue(103);
        buffer.enqueue(104);
        buffer.enqueue(105);

        buffer.display();

        buffer.enqueue(106);

        System.out.println("\nProcessed Packet: " + buffer.dequeue());
        System.out.println("Processed Packet: " + buffer.dequeue());

        buffer.display();


        buffer.enqueue(106);
        buffer.enqueue(107);

        buffer.display();

        System.out.println("\nFront Packet: " + buffer.peek());
    }
}
