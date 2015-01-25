package ch2;
public class Node<T> {
	public Node<T> next = null;
	public T data;

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
		if (array.length > 0) {
			data = array[0];
			next = null;

			for (int i = 1; i < array.length; i++) {
				this.appendToTail(array[i]);
			}		
		} else {
			data = null;
			next = null;
		}
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