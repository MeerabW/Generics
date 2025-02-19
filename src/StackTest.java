/**
 * Test class for the Stack<T> implementation.
 * It tests both an Integer stack and a String stack with correctness checks.
 * @author Meerab Wali
 * @version 2024-02-19
 */
public class StackTest {
    public static void main(String[] args) {
        testNumberStack();
        testTextStack();
    }

    /**
     * Tests a stack of integers with push, pop, peek, and list operations.
     */
    private static void testNumberStack() {
        System.out.println("Testing Number Stack...");

        // Create a new Integer stack
        Stack<Integer> numberStack = new Stack<>();

        try {
            // Test: Pushing numbers onto the stack
            System.out.println("Testing push operation with 10, 20, 30...");
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);
            // Verifying list output
            String expectedListAfterPush = "10; 20; 30";
            String actualListAfterPush = numberStack.list();
            checkOutput(actualListAfterPush, expectedListAfterPush);

            // Test: Peeking at the top element
            System.out.println("Testing peek operation...");
            Integer expectedPeek = 30;
            Integer actualPeek = numberStack.peek();
            checkOutput(actualPeek.toString(), expectedPeek.toString());

            // Test: Popping an element from the stack
            System.out.println("Testing pop operation...");
            Integer expectedPop = 30;
            Integer actualPop = numberStack.pop();
            checkOutput(actualPop.toString(), expectedPop.toString());

            // Verifying stack after popping one element
            String expectedListAfterPop = "10; 20";
            String actualListAfterPop = numberStack.list();
            checkOutput(actualListAfterPop, expectedListAfterPop);

            // Test: Popping all elements from the stack
            numberStack.pop();
            numberStack.pop();

            // Test: Trying to pop from an empty stack (should throw exception)
            try {
                System.out.println("Testing pop on empty stack...");
                numberStack.pop();
            } catch (StackEmptyException e) {
                checkOutput(e.getMessage(), "Stack is Empty");
            }
        } catch (StackEmptyException | StackFullException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println(); // Blank line for readability
    }

    /**
     * Tests a stack of strings with push, pop, peek, and list operations.
     */
    private static void testTextStack() {
        System.out.println("Testing Text Stack...");

        // Create a new String stack
        Stack<String> textStack = new Stack<>();

        try {
            // Test: Pushing words onto the stack
            System.out.println("Testing push operation with 'Hello', 'World', 'Java'...");
            textStack.push("Hello");
            textStack.push("World");
            textStack.push("Java");

            // Verifying the list output
            String expectedListAfterPush = "Hello; World; Java";
            String actualListAfterPush = textStack.list();
            checkOutput(actualListAfterPush, expectedListAfterPush);

            // Test: Peeking at the top element
            System.out.println("Testing peek operation...");
            String expectedPeek = "Java";
            String actualPeek = textStack.peek();
            checkOutput(actualPeek, expectedPeek);

            // Test: Popping an element from the stack
            System.out.println("Testing pop operation...");
            String expectedPop = "Java";
            String actualPop = textStack.pop();
            checkOutput(actualPop, expectedPop);

            // Verifying stack after popping one element
            String expectedListAfterPop = "Hello; World";
            String actualListAfterPop = textStack.list();
            checkOutput(actualListAfterPop, expectedListAfterPop);

            // Test: Popping all elements from the stack
            textStack.pop();
            textStack.pop();

            // Test: Trying to peek at an empty stack (should throw exception)
            try {
                System.out.println("Testing peek on empty stack...");
                textStack.peek();
            } catch (StackEmptyException e) {
                checkOutput(e.getMessage(), "Stack is Empty");
            }
        } catch (StackEmptyException | StackFullException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    /**
     * Compares the actual output with the expected output and prints the result.
     *
     * @param actual The actual output of the method call.
     * @param expected The expected output.
     */
    private static void checkOutput(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("Output is correct: " + actual + " ✅");
        } else {
            System.out.println("Incorrect output! Expected: " + expected + " but got: " + actual + " ❌");
        }
    }
}
