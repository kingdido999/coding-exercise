/*
 * 1.1
 * Implement an algorithm to determine if a string has all unique 
 * characters. What if you cannot use additional data structures?
 */

package ch1;

public class HasUniqueChars {
	public boolean hasUniqueChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);

			for (int j = 0; j < s.length(); j++) {
				if (j != i && currentChar == s.charAt(j)) {
					return false;
				}
			}
		}

		return true;
	}
}