// Print out the grade-school multiplication table up to 12x12

package extra;

public class MultTables {
    public static void multTables(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int mult = i * j;
                System.out.printf("%d ", mult);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        multTables(12);
    }
}