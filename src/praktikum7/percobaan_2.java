package praktikum7;

import java.util.Scanner;

public class percobaan_2 {
    public static void main(String[] args) {
        // Square
        Scanner sc = new Scanner(System.in);
        System.out.print("Maukkan jumlah bintang: ");
        int star = sc.nextInt();

        for (int i = 0; i < star; i++) {
            for(int j = 0; j < star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
