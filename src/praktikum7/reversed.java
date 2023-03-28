package praktikum7;

import java.util.Scanner;

public class reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Maukkan jumlah bintang: ");
        int star = sc.nextInt();
        int side = 1;
        int space = star - 1;
        
        for (int i = 0; i < star; i++) {
            for(int n = 0; n < space; n++){
                System.out.print(" ");
            }
            for(int j = 0; j < side; j++){
                System.out.print("*");
            }
            space--;
            side++;
            System.out.println();
        }

        sc.close();
    }
}
