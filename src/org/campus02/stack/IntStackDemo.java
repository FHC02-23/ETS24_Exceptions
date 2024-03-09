package org.campus02.stack;

import org.campus02.stack.stackexceptions.ApplicationException;
import org.campus02.stack.stackexceptions.StackEmptyException;
import org.campus02.stack.stackexceptions.StackFullException;

import java.util.Arrays;

public class IntStackDemo {


    public static void main(String[] args) throws ApplicationException {

        try {
            IntStack stack = new IntStack(2);
            stack.pop();
            stack.push(3);
            int value = stack.pop();
            System.out.println("value = " + value);

            stack.push(3);
            stack.push(4);
            stack.push(5);
        } catch (StackEmptyException e) {
            throw new ApplicationException("Anscheinend Stack leer", e);
        } catch (StackFullException e) {
            throw new ApplicationException("Stack bestimmt voll", e);
        }
    }
}
