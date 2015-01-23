// Write function to print the odd numbers from 1 to 99

package extra;

public class PrintOdd {
    public static void printOdd(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.printf("%d ", i);
        }
    }

    public static void main(String[] args) {
        printOdd(99);
    }
}