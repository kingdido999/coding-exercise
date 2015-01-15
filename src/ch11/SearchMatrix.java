/*
 * 11.6
 * Given an M x N matrix in which each row and each column is sorted
 * in ascending order, write a method to find an element.
 */

package ch11;

public class SearchMatrix {
	public Tuple<Integer, Integer> searchMatrix(int[][] m, int elem) {
		int row = 0;
		int col = m[0].length - 1;

		while (row < m.length && col >= 0) {
			if (m[row][col] == elem) {
				return new Tuple<Integer, Integer>(row, col);
			} else if (m[row][col] > elem) {
				col--;
			} else {
				row++;
			}
		}

		return null;
	}
}