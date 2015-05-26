/*
 * 1.3
 * Given two strings, write a method to decide if one is a permutation of the
 * other.
 */

package ch1;

public class IsPermutation {
	public boolean isPermutation(String a, String b) {
		if (a.length() != b.length()) {
      return false;
    }

    StringBuilder sb = new StringBuilder(b);

    for (int i = 0; i < a.length(); i++) {
      char char_a = a.charAt(i);

      for (int j = 0; j < sb.length(); j++) {
        char char_b = sb.charAt(j);

        if (char_b == char_a) {
          sb.deleteCharAt(j);
          break;
        }
      }
    }

    if (sb.length() == 0) {
      return true;
    }

    return false;
	}

  // SOLUTION
  public String sort(String s) {
    char[] content = s.toCharArray();
    java.util.Arrays.sort(content);
    return new String(content);
  }

  public boolean permutation(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    return sort(s).equals(sort(t));
  }
}
