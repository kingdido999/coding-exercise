package ch11;

public class Tuple<X, Y> {
	public final X x;
	public final Y y;
	public Tuple(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Tuple<Object, Object> other) {
		return (this.x == other.x && this.y == other.y);
	}
}