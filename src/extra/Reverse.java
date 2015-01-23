package extra;

public class Reverse {
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        String result = sb.toString();

        return result;
    }
}