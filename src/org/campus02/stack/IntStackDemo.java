package org.campus02.stack;

import org.campus02.stack.stackexceptions.StackEmptyException;

import java.util.Arrays;

public class IntStackDemo {


    public static void main(String[] args)  {

        IntStack stack = new IntStack(2);
        try {
            stack.pop();
        } catch (StackEmptyException e) {
            throw new RuntimeException(e);
        }
        stack.push(3);
        int value = stack.pop();
        System.out.println("value = " + value);

        stack.push(3);
        stack.push(4);
        stack.push(5);
    }
}
