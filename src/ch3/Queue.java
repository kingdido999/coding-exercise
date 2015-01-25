// a  ->  b ->   c ->   d
// |                    |
// first               last
package ch3;

import ch2.Node;

public class Queue {
    Node first, last;

    void enqueue(Object item) {
        if (first == null) {
            first.data = item;
            last = first;
        } else {
            Node n = new Node(item);
            last.next = n;
            last = last.next;
        }
    }

    Object dequeue() {
        if (first != null) {
            Object item = first.data;
            first = first.next;

            if (first == null) {
                // empty queue
                last = null;
            }

            return item;
        }

        return null;
    }
}