package praktikum3;

import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        double gaji = getInput(); // Gaji Rp 3275000
        double potongan = 0.1 * gaji; // Pajak 10%
        double gajiBersih = gaji - potongan;
        System.out.printf("Gaji Bersih: Rp %.2f", gajiBersih);
    }

    // Mendapatkan input
    public static double getInput() {
        Scanner sc = new Scanner(System.in);
        double inp = 0;
        while (inp <= 0) {
            System.out.print("Gaji kotor: Rp ");

            try {
                inp = Double.parseDouble(sc.nextLine());
            } catch (Exception numberFormatException) {
                continue;
            }
        }
        sc.close();
        return inp;
    }
}
