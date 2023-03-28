package praktikum7;

import java.util.Scanner;

public class percobaan_1 {
    public static void main(String[] args) {
        // Star

        Scanner sc = new Scanner(System.in);
        System.out.print("Maukkan jumlah bintang: ");
        int star = sc.nextInt();

        for(int i = 0; i < star; i++){
            System.out.print("*");
        }
        sc.close();
    }
}
