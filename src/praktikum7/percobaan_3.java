package praktikum7;

import java.util.Scanner;

public class percobaan_3 {
    public static void main(String[] args) {
        // Triangle 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Maukkan jumlah bintang: ");
        int star = sc.nextInt();
        int side = star;
        for (int i = 0; i < star; i++) {
            for(int j = 0; j < side; j++){
                System.out.print("*");
            }
            side--;
            System.out.println();
        }
        sc.close();
    }
}
