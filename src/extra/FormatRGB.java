// Format an RGB value (three 1-byte numbers) as a 6-digit hexadecimal string
package extra;

public class FormatRGB {
    public String formatRGB(int r, int g, int b) {
        return (toHex(r) + toHex(g) + toHex(b)).toUpperCase();
    }

    public String toHex(int c) {
        String s = Integer.toHexString(c);
        return (s.length() == 1 ) ? "0" + s : s;
    }
}