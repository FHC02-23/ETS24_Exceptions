package org.campus02.stack.stackexceptions;

public class StackFullException extends Exception {

    public StackFullException(String message) {
        super(message);
    }

    public StackFullException(String message, Throwable cause) {
        super(message, cause);
    }
}
