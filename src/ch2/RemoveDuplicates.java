/*
 * 2.1
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */

package ch2;

import java.util.Hashtable;

public class RemoveDuplicates {
	public Node<Object> removeDuplicates(Node<Object> head) {
		Hashtable<Object, Object> table = new Hashtable<Object, Object>();
		Node<Object> n = head;
		Node<Object> previous = null;

		while (n != null) {
			if (table.containsKey(n.data)) {
				previous.next = n.next;
			} else {
				table.put(n.data, true);
				previous = n;
			}

			n = n.next;
		}

		return head;
	}
}