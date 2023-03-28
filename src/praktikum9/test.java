package praktikum9;

import java.util.Scanner;

public class test {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        process(scanner);
        scanner.close();
    }

    public static void process(Scanner scanner) {
        int array[][] = new int[2][];
        array[0] = new int[3];
        array[1] = new int[5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Masukkan elemen pada array [%d][%d] : ",i,j);
                array[i][j] = scanner.nextInt();
            }
        }

        // // Baris ke 1 (index 0)
        // for (int j = 0; j < array[0].length; j++) {
        //     System.out.printf("Masukkan elemen pada array [0][%d] : ",j);
        //     array[0][j] = scanner.nextInt();
        // }

        for (int[] arr : array) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
    
}
