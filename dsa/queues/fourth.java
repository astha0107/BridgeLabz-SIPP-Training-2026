package dsa.queues;

import java.util.*;

public class fourth {
    public static int[] slidingWindowMaximum(int[] readings, int k) {
        int n = readings.length;
        if (n == 0 || k == 0)
            return new int[0];

        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() &&
                    readings[deque.peekLast()] <= readings[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = readings[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] readings = {10, 5, 2, 7, 8, 7};
        int k = 3;
        int[] answer = slidingWindowMaximum(readings, k);
        System.out.println("Throughput Readings:");
        System.out.println(Arrays.toString(readings));
        System.out.println("\nSliding Window Maximum:");
        System.out.println(Arrays.toString(answer));
    }
}
