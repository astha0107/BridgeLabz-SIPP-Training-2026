package dsa.stack;

import java.util.Stack;

public class third {

    // Function to check if brackets are balanced
    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Process closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                // Case 1: No matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Case 2: Mismatched bracket
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Stack must be empty for a valid expression
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "{[()]}";
        String s2 = "{[(])}";
        String s3 = "{{[]}}()";
        String s4 = "(((";
        String s5 = "())";

        System.out.println(s1 + " -> " + isBalanced(s1));
        System.out.println(s2 + " -> " + isBalanced(s2));
        System.out.println(s3 + " -> " + isBalanced(s3));
        System.out.println(s4 + " -> " + isBalanced(s4));
        System.out.println(s5 + " -> " + isBalanced(s5));
    }
}