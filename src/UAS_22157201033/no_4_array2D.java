package UAS_22157201033;

import java.util.Scanner;

public class no_4_array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input baris
        int n = 0;
        System.out.print("Jumlah data? ");
        try {
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input berup angka");
        }
        if (n <= 0) {
            System.out.println("Input harus lebih dari 0");
            System.exit(1);
        }

        // input array
        String[][] array = new String[n][3];
        String nama, alamat, telepon;
        nama = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("---input---");
            System.out.print("Nama : ");
            nama = scanner.nextLine();
            System.out.print("Alamat : ");
            alamat = scanner.nextLine();
            System.out.print("Telepon : ");
            telepon = scanner.nextLine();

            array[i][0] = nama;
            array[i][1] = alamat;
            array[i][2] = telepon;
        }

        // print hasil
        System.out.println("------------------Tabel------------------");
        System.out.println("| Nama \t| Alamat \t| Telepon \t|");
        for (String[] baris : array) {
            System.out.print("| ");
            for (String isi : baris) {
                System.out.print(isi + "\t| ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");

        scanner.close();
    }
}
