package org.example.top_interviewQA;

import java.util.LinkedList;

public class SimilarStack {
}

class MyQueue {
    private LinkedList<Integer> elements;

    public MyQueue() {
        elements = new LinkedList<>();
    }

    public void push(int x) {
        elements.add(x);
    }

    public int pop() {
        return elements.pop();
    }

    public int peek() {
        Integer peek = elements.peek();
        if (peek != null) {
            return peek;
        }
        return 0;
    }

    public boolean empty() {
        return elements.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(23);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();


    }
}

