// Write a function that sums up integers from a text file, one int per line
// ***not working

package extra;

import java.io.BufferedReader;
import java.io.FileReader;

public class SumFile {
    public int sumFile(String filename) {
        try {
            int sum = 0;
            BufferedReader in = new BufferedReader(new FileReader(filename));

            for (String s = in.readLine(); s != null; s = in.readLine()) {
                sum += Integer.parseInt(s);
            }
            
            in.close();
            return sum;
        }
        catch (Exception xc) {
            return -1;
        }
    }
}