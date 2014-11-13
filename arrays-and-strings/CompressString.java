/*
 * 1.5
 * Implement a method to perform basic string compression using the 
 * counts of repeated characters. For example, the string aabcccccaaa 
 * would become a2blc5a3. If the "compressed" string would not become 
 * smaller than the original string, your method should return the 
 * original string.
 */

public class CompressString {
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
		String s1 = "aabcccccaa";
		String s2 = "abc";

		System.out.println(s1 + ": " + compressString(s1));
		System.out.println(s2 + ": " + compressString(s2));		
	}
}