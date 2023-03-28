package UAS_22157201033;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class no_1a_persegiPanjang {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double panjang = 0.0, lebar = 0.0, luas = 0.0;

        System.out.println("---Luas persegi panjang---");

        while(panjang <= 0.0 || lebar <= 0.0) {
            try {
                System.out.print("Panjang : ");
                panjang = Double.valueOf(br.readLine());
                System.out.print("Lebar : ");
                lebar = Double.valueOf(br.readLine());
            } catch (Exception e) {
                continue;
            }
        }

        luas = panjang * lebar;
        System.out.printf("Luas persegi panjang adalah : %.2f", luas);
    }
}
