package org.campus02.stack.stackexceptions;

/**
 * benutzerdefinierte Exception wenn der Stack leer ist
 */
public class StackEmptyException extends Exception {


    // Überladung der Konstruktoren
    public StackEmptyException(String message) {
        super(message);
    }

    // message + cause
    public StackEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}
