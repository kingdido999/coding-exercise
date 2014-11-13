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

public class ReplaceString {
	private static String replaceString(String s, int len) {
		String result = "";

		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == ' ') result += "%20";
			else result += s.charAt(i);
		}

		return result;
	}

	public static void main(String[] args) {
		String s1 = "Mr John Smith    ";
		int len = 13;
		
		System.out.println(s1 + ": " + replaceString(s1, len));
	}
}