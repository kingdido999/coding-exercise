/*
 * 2.1
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */

package ch2;

import java.util.Hashtable;

public class RemoveDuplicates {
	public Node removeDuplicates(Node head) {
		Hashtable table = new Hashtable();
		Node n = head;
		Node previous = null;

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