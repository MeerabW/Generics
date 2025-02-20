/**
 * Custom exception thrown when an operation is attempted on an empty stack.
 * @author Meerab Wali
 * @version 2024- 02-19
 */
public class StackEmptyException extends Exception{
    /**
     * Default constructor for StackEmptyException.
     */
    public StackEmptyException() {
    }
    /**
     * Constructor that accepts a custom error message.
     * @param message The error message describing the exception.
     */
    public StackEmptyException(String message) {
        super(message);
    }
}
