// Write function to compute Nth fibonacci number

package extra;

public class Fib {
    // recursive
    public int fib(int n) {
        return (n <= 1) ? n : (fib(n - 2) + fib(n - 1));
    }

    // non-recursive
    public int fib2(int n) {
        if (n <= 1) {
            return n;
        }

        int p1 = 0, p2 = 1, p3 = 0;

        for (int i = 2; i <= n; i++) {
            p3 = p1 + p2;
            p1 = p2;
            p2 = p3;
        }

        return p3;
    }
}