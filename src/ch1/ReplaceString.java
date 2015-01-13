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
 * Output: "Mr%20John%20Smith"
 */

package ch1;

public class ReplaceString {
	public String replaceString(String s, int len) {
		String result = "";

		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == ' ') result += "%20";
			else result += s.charAt(i);
		}

		return result;
	}
}