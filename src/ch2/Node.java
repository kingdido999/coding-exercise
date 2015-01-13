package ch2;
public class Node<T> {
	Node<T> next = null;
	T data;

	public Node() {
		data = null;
		next = null;
	}

	public Node(T d) {
		data = d;
		next = null;
	}

	public Node(T d, Node<T> n) {
		data = d;
		next = n;
	}

	public Node(T[] array) {
		Node<T> n = new Node<T>();
		Node<T> head = n;

		for (int i = 0; i < array.length; i++) {
			n.data = array[i];

			if (i + 1 < array.length) {
				n.next = new Node<T>(array[i+1]);
				n = n.next;
			}
		}

		data = head.data;
		next = head.next;
	}

	public Node<T> next() {
		return next;
	}

	public int size() {
		int count = 1;
		Node<T> copy = this;

		while (copy.next != null) {
			count++;
			copy = copy.next;
		}

		return count;
	}

	public void appendToTail(T d) {
		Node<T> end = new Node<T>(d);
		Node<T> n = this;

		while (n.next != null) {
			n = n.next;
		}

		n.next = end;
	}

	public boolean equals(Node<T> that) {
		if (this.size() != that.size()) {
			return false;
		}

		Node<T> thisCopy = this;
		Node<T> thatCopy = that;

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