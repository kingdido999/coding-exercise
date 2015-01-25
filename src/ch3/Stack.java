package ch3;

import ch2.Node;

public class Stack {
    Node top;

    Object pop() {
        if (top != null) {
            Object item = top.data;
            top = top.next;
            return item;
        }

        return null;
    }

    void push(Object item) {
        Node n = new Node(item);
        n.next = top;
        top = n;
    }

    Object peek() {
        return top.data;
    }
}