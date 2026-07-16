package dsa.stack;

import java.util.Stack;
import java.util.Arrays;

public class fourth {

    // Function to find Next Greater Element
    public static int[] nextGreaterElement(int[] visitors) {

        int n = visitors.length;
        int[] result = new int[n];

        // Initialize all answers as -1
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>(); // Stores indices

        for (int i = 0; i < n; i++) {

            // Current visitor count is greater than previous unresolved days
            while (!stack.isEmpty() && visitors[i] > visitors[stack.peek()]) {
                int index = stack.pop();
                result[index] = visitors[i];
            }

            // Store current day's index
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] visitors = {100, 80, 120, 90, 150, 110};

        int[] answer = nextGreaterElement(visitors);

        System.out.println("Visitor Counts:");
        System.out.println(Arrays.toString(visitors));

        System.out.println("Next Greater Visitor Count:");
        System.out.println(Arrays.toString(answer));
    }
}
