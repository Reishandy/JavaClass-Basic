package praktikumMethod.percobaan_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputconsole {
    public static String readString() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String string = "";
        try {
            string = bfr.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return string;
    }

    public static int readInt() {
        try {
            return Integer.valueOf(readString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static double readDouble() {
        try {
            return Double.valueOf(readString());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
