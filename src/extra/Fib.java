package extra;

public class Fib {
    public int fib(int n) {
        return (n <= 1) ? n : (fib(n - 2) + fib(n - 1));
    }
}