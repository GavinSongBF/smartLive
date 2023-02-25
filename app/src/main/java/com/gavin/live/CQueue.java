package com.gavin.live;

import java.util.Stack;

public class CQueue {

    private final Stack<Integer> originalStack, helpStack;
    public CQueue() {
        originalStack = new Stack<Integer>();
        helpStack = new Stack<Integer>();
    }

    public void appendTail(int value) {
        originalStack.push(value);
    }

    public int deleteHead() {
        if(originalStack.empty()){
            return -1;
        }
        while(!originalStack.empty()){
            helpStack.push(originalStack.pop());
        }
        Integer integer = helpStack.pop();
        if (integer == null){
            return -1;
        }
        int index = integer;
        while(!helpStack.empty()){
            originalStack.push(helpStack.pop());
        }
        return index;

    }
}
