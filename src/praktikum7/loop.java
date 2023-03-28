package praktikum7;
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bintang: ");
        int star = sc.nextInt();
        sc.close();

        // Penggunaan For and Do While
        System.out.println("\nFor and Do While");
        for (int i = 0; i < star; i++) {
            int j = 0;
            do {
                System.out.print("*");
                j++;
            } while (j < star);
            System.out.println();
        }

        // Penggunaan While and Do While
        System.out.println("\nWhile and Do While");
        int i2 = 0;
        while(i2 < star) {
            int j2 = 0;
            do {
                System.out.print("*");
                j2++;
            } while (j2 < star);
            System.out.println();
            i2++;
        }

        // Penggunaan While and For
        System.out.println("\nWhile and For");
        int i3 = 0;
        while(i3 < star) {
            for(int j3 = 0; j3 < star; j3++) {
                System.out.print("*");
            }
            System.out.println();
            i3++;
        }

        // Penggunaan Do While and For
        System.out.println("\nDo While and For");
        int i4 = 0;
        do {
            for (int j4 = 0; j4 < star; j4++) {
                System.out.print("*");
            }
            System.out.println();
            i4++;
        } while (i4 < star);
    }
}
