/*
 * 11.5
 * Given a sorted array of strings which is interspersed with empty 
 * strings, write a method to find the location of a given string.
 * 
 * EXAMPLE
 * input: find "ball" in 
 * {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""}
 * output: 4
 */

package ch11;

public class FindString {
	public int findString(String str, String[] a, int start, int end) {
		int mid = (start + end) / 2;

		if (a[mid] == "") {
			int closestLeft = mid;
			int closestRight = mid;
			int countLeft = 0;
			int countRight = 0;

			while (a[closestLeft] == "") {
				closestLeft--;
				countLeft++;
			}

			while (a[closestRight] == "") {
				closestRight++;
				countRight++;
			}

			mid = (countLeft > countRight) ? closestRight : closestLeft;
		}

		if (a[mid] == str) return mid;

		if (str.compareTo(a[mid]) < 0) {
			return findString(str, a, start, mid - 1);
		} else if (str.compareTo(a[mid]) > 0) {
			return findString(str, a, mid + 1, end);
		}

		return -1;
	}
}
