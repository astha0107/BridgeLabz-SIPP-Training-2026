package dsa.stack;

class Node {
    String functionName;
    Node next;

    Node(String functionName) {
        this.functionName = functionName;
        this.next = null;
    }
}

class LinkedListStack {
    private Node top;

    // Constructor
    LinkedListStack() {
        top = null;
    }

    // Push operation
    public void push(String functionName) {
        Node newNode = new Node(functionName);
        newNode.next = top;
        top = newNode;
        System.out.println(functionName + " called.");
    }

    // Pop operation
    public String pop() {
        if (top == null) {
            System.out.println("Call Stack is empty.");
            return null;
        }

        String returnedFunction = top.functionName;
        top = top.next;
        return returnedFunction;
    }

    // Peek operation
    public String peek() {
        if (top == null) {
            return null;
        }
        return top.functionName;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display current call stack
    public void displayStack() {
        if (top == null) {
            System.out.println("Call Stack is empty.");
            return;
        }

        System.out.println("Current Call Stack:");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.functionName);
            temp = temp.next;
        }
    }
}

public class second {
    public static void main(String[] args) {

        LinkedListStack callStack = new LinkedListStack();

        // Function calls
        callStack.push("main()");
        callStack.push("login()");
        callStack.push("validateUser()");
        callStack.push("checkPassword()");

        // Currently executing function
        System.out.println("\nCurrently Executing: " + callStack.peek());

        // Display stack
        System.out.println();
        callStack.displayStack();

        // Function returns
        System.out.println("\nReturned from: " + callStack.pop());
        System.out.println("Returned from: " + callStack.pop());

        // Current function after returns
        System.out.println("\nCurrently Executing: " + callStack.peek());

        // Display updated stack
        System.out.println();
        callStack.displayStack();
    }
}
