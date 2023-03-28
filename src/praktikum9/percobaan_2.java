package praktikum9;

import java.util.Scanner;

public class percobaan_2 {
    public static void main(String[] args) {
        // Inisialisasi scanner untuk input.
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input besar array.
        System.out.printf("Masukkan besar array (ex. 3x4, 2x2, ...) : ");
        // Memisahkan baris dan kolom dari input dengan tanda x, ex -> 3x4 = 3 4, 10x2 = 10 2. 
        String[] input = scanner.nextLine().split("x");
        // Inisialisasi array sesuai dengan input baris dan kolom dari array input.
        int[][] array = new int[Integer.valueOf(input[0])][Integer.valueOf(input[1])];

        // Meminta input dengan nested loop.
        System.out.println("Masukkan nilai elemen pada array berupa angka bulat desimal.");
        // Outer loop digunakan untuk iterasi baris pada array 2d (3).
        for (int i = 0; i < array.length; i++) {
            // Inner loop untuk ,engiterasikan setiap kolom pada array 2d (4).
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("array [%d,%d] : ", i, j);
                // Memasukkan nilai pada array (tanpa error checking).
                array[i][j] = scanner.nextInt();
            }
        }

        // Mengoutputkan array 2d (3x4).
        System.out.println("\nArray 3 x 4 : ");
        // Loop sama dengan diatas.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Mengoutputkan nilai pada array dipisahkan dengan spasi.
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Membuat baris baru sesuai array.
        }
        scanner.close(); // Menutup scanner
    }
}
