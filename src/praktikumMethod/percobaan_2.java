package praktikumMethod;

import java.util.Scanner;

public class percobaan_2 {
    public static void main(String[] args) {
        // input nilai x dan n menggunakan fungsi input.
        Scanner scanner = new Scanner(System.in);
        int[] input = input(scanner);
        int x = input[0], n = input[1]; 

        // mamnggil fungsiSigma dengan argumen x dan n yang kemudian
        // di masukkan ke variabel hasil.
        int hasil = fungsiSigma(x, n);

        // output hasil perhitungan.
        System.out.println("----------");
        System.out.println("Hasil adalah : " + hasil);
        scanner.close();
    }

    /**
     * @param x
     * @param n
     * @return hasil dari formula "y = n sigma i = 1, x + (2 x i)"
     */
    public static int fungsiSigma(int x, int n) {
        // insisialisasi vriable hasil untuk dikembalikan.
        int retValue = 0;
        // perhitungan menggunakan loop dimana n digunakan sebagai
        // batas atas.
        for (int i = 1; i <= n; i++) {
            // setiap iterasi akan print formula saat ini.
            System.out.println(x + " + (2 x " + i + ")");
            // hasil akan ditambahkan setiap iterasi.
            retValue += x + (2 * i);
        }
        // mengembalikan hasil perhitungan.
        return retValue;
    }

    /**
     * fungsi ini akan mendapatkan input x dan n dari console menggunakan Scanner
     * yang kemudian hasilnya akan dikembalikan dalam bentuk array dimana x berada 
     * di index 0 dan n berada di index 1.
     * @param scanner : membutuhkan scanner untuk mendapatkan input.
     * @return x dan n di array.
     */
    public static int[] input(Scanner scanner) {
        System.out.print("> Masukkan nilai x : ");
        int x = scanner.nextInt();
        System.out.print("> Masukkan nilai n : ");
        int n = scanner.nextInt();
        System.out.println("----------");
        int[] retValue = {x, n};
        return retValue;
    }   
}