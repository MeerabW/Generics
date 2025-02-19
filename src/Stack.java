/**
 * A generic Stack implementation using an array.
 * Supports push, pop, peek, and listing elements.
 * Throws exceptions for stack overflow and underflow.
 *
 * @param <T> The type of elements stored in the stack.
 *
 * @author Meerab Wali
 * @version 2024-02-19
 */
public class Stack<T> {
    Object[] array;
    int top = -1;

    /**
     * Default constructor initializing stack with size 10.
     */
    public Stack() {
        this.array = new Object[10];
    }

    /**
     * Constructor initializing stack with an existing array.
     * Sets top to the last non-null element.
     * @param array The initial array to be used as a stack.
     */
    public Stack(Object[] array) {
        this.array = array;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                this.top = i;
            }
        }
    }

    /**
     * Pushes an element onto the stack.
     * @param data The element to be added.
     * @throws StackFullException If the stack is full.
     */
    public void push (T data) throws StackFullException {
        if (top == array.length - 1) {
            throw new StackFullException("Stack is full!");
        }
        array[++top] = data;
    }

    /**
     * Removes and returns the top element of the stack.
     * @return The removed top element.
     * @throws StackEmptyException If the stack is empty.
     */
    @SuppressWarnings("unchecked")
    public T pop () throws StackEmptyException {
        if(this.top == -1) {
            throw new StackEmptyException("Stack is Empty");
        }
        T element = (T) array[top];
        array[top] = null;
        top--;
        return element;
    }

    /**
     * Returns the top element of the stack without removing it.
     * @return The top element.
     * @throws StackEmptyException If the stack is empty.
     */
    @SuppressWarnings("unchecked")
    public T peek () throws StackEmptyException {
    if(this.top == -1) {
        throw new StackEmptyException("Stack is Empty");
    }
    return (T) this.array[top];
    }

    /**
     * Returns a string representation of the stack elements,
     * separated by "; ".
     * @return A formatted string of all stack elements.
     * @throws StackEmptyException If the stack is empty.
     */
    public String list() throws StackEmptyException {
        if(array == null) { throw new StackEmptyException("Stack is empty"); }
        String output="";
        for(int i=0; i < this.array.length; i++) {
            if(array[i] != null) {
                output += array[i];
                if(i < top) {
                    output += "; ";
                }
            }
        }
        return output;
    }
}
