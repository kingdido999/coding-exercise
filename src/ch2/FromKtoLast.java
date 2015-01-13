/*
 * 2.2
 * Implement an algorithm to find the kth to last element of a 
 * singly linked list 
 */

package ch2;

public class FromKtoLast {
	public Node<Object> fromKtoLast(Node<Object> n, int k) {
		Node<Object> copy = n;

		for (int i = 0; i < k; i++) {
			if (copy.next != null) {
				copy = copy.next;
			} else {
				return null;
			}
		}

		return copy;
	}
}