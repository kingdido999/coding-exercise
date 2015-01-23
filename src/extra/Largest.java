// Find the largest int value in an int array

package extra;

public class Largest {
    public int largest(int[] input) {
        int max = input[0];

        for (int i = 1; i < input.length; i++) {
            if (max < input[i]) {
                max = input[i];
            }
        }

        return max;
    }
}