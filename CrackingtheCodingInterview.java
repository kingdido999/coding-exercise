public class CrackingtheCodingInterview {
	/*
	 * 1.1
	 * Implement an algorithm to determine if a string has all unique 
	 * characters. What if you cannot use additional data structures?
	 */
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

	/*
	 * 1.4
	 * Write a method to replace all spaces in a string with'%20'. 
	 * You may assume that the string has sufficient space at the end of 
	 * the string to hold the additional characters, and that you are given 
	 * the "true" length of the string. 
	 * (Note: if implementing in Java, please use a character array so that 
	 * you can perform this operation in place.)
	 * 
	 * EXAMPLE
	 * Input: "Mr John Smith
	 * Output: "Mr%20Dohn%20Smith"
 	 */
	private static String replaceString(String s, int len) {
		String result = "";

		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == ' ') result += "%20";
			else result += s.charAt(i);
		}

		return result;
	}

	/*
	 * 1.5
	 * Implement a method to perform basic string compression using the 
	 * counts of repeated characters. For example, the string aabcccccaaa 
	 * would become a2blc5a3. If the "compressed" string would not become 
	 * smaller than the original string, your method should return the 
	 * original string.
	 */
 	private static String compressString(String s) {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			result += c;

			int count = 0;
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(j) == c) count += 1;
				else break;
			}

			i += count - 1;
			result += Integer.toString(count);
		}

		if (result.length() < s.length()) return result;
		else return s;
	}	

	public static void main(String[] args) {
		// Arrays and Strings
		System.out.println("1.1");
		System.out.println(hasUniqueChars("aabc"));
		System.out.println(hasUniqueChars("abc"));
		System.out.println();

		System.out.println("1.4");
		System.out.println(replaceString("Mr John Smith    ", 13));
		System.out.println();

		System.out.println("1.5");
		System.out.println(compressString("aabcccccaa"));
		System.out.println(compressString("abc"));	
		System.out.println();		
	}

}