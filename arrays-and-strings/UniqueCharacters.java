/*
 * 1.1
 * Implement an algorithm to determine if a string has all unique 
 * characters. What if you cannot use additional data structures?
 */

public class UniqueCharacters {
	private static boolean hasUniqueChars(String s) {
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

	public static void main(String[] args) {
		String s1 = "aabc";
		String s2 = "abc";

		System.out.println(s1 + ": " + hasUniqueChars(s1));
		System.out.println(s2 + ": " + hasUniqueChars(s2));
	}
}