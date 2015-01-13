package ch2;
public class Node<T> {
	Node next = null;
	T data;

	public Node(T d) {
		data = d;
		next = null;
	}

	public Node(T d, Node n) {
		data = d;
		next = n;
	}

	public Node next() {
		return next;
	}

	public int size() {
		int count = 1;
		Node copy = this;

		while (copy.next != null) {
			count++;
			copy = copy.next;
		}

		return count;
	}

	public void appendToTail(T d) {
		Node end = new Node(d);
		Node n = this;

		while (n.next != null) {
			n = n.next;
		}

		n.next = end;
	}

	public boolean equals(Node that) {
		if (this.size() != that.size()) {
			return false;
		}

		Node thisCopy = this;
		Node thatCopy = that;

		if (thisCopy.data != thatCopy.data) {
			return false;
		}

		while (thisCopy.next != null) {
			if (thisCopy.next.data != thatCopy.next.data) {
				return false;
			}

			thisCopy = thisCopy.next;
			thatCopy = thatCopy.next;
		}

		return true;
	}
}