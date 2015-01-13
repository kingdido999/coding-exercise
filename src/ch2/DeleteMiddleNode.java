/*
 * 2.3
 * Implement an algorithm to delete a node in the middle of a singly 
 * linked list, given only access to that node.
 * 
 * EXAMPE
 * Input: a linked list a->b->c->d->e
 * Output: nothing is returned, but the new linked list a->b->d->e
 */

package ch2;

public class DeleteMiddleNode {
	public void deleteMiddleNode(Node m) {
		if (m != null && m.next != null) {
			Node next = m.next;
			m.data = next.data;
			m.next = next.next;
		}
	}
}