/**
 * Custom exception thrown when an operation is attempted on a full stack.
 * @author Meerab Wali
 * @version 2024-02-19
 */
public class StackFullException extends Exception{

    /**
     * Default constructor for StackFullException.
     */
    public StackFullException() {
    }

    /**
     * Constructor that accepts a custom error message.
     * @param message The error message describing the exception.
     */
    public StackFullException(String message) {
        super(message);
    }
}
