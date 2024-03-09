package org.campus02.stack;

import org.campus02.stack.stackexceptions.StackEmptyException;
import org.campus02.stack.stackexceptions.StackFullException;

public class IntStack {

    private int[] stack;
    private int pointer;

    public IntStack(int maxSize) {
        this.stack = new int[maxSize];
        this.pointer = -1;
    }

    public void push(int value) throws StackFullException {
        if (pointer == stack.length - 1) {
            throw new StackFullException("Stack ist bereits voll");
        }
        pointer ++; // pointer um 1 erhöhen
        stack[pointer] = value;
    }

    public int pop() throws StackEmptyException {
        if (pointer == -1) {
            throw new StackEmptyException("Mein Stack hat nichts zum hergeben");
        }
        int res = stack[pointer];
        stack[pointer] = 0;
        pointer --;
        return res;
    }
}
