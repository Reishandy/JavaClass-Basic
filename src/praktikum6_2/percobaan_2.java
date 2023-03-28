package praktikum6_2;

import java.util.Scanner;

public class percobaan_2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number, temp;

            // For loop
            System.out.println("===== For loop with break =====");
            for (temp = 0; true;) {
                System.out.print("Input number: ");
                number = sc.nextInt();
                temp += number;
                if (temp > 50) break;
            }
            System.out.printf("Number stopped at : %d \n\n", temp);

            // While loop
            System.out.println("===== While loop with break =====");
            temp = 0;
            while (true) {
                System.out.print("Input number: ");
                number = sc.nextInt();
                temp += number;
                if (temp > 50)break;
            }
            System.out.printf("Number stopped at : %d \n\n", temp);

            // Do While loop
            System.out.println("===== Do While loop with break =====");
            temp = 0;
            do {
                System.out.print("Input number: ");
                number = sc.nextInt();
                temp += number;
                if (temp > 50)break;
            } while (true);
            System.out.printf("Number stopped at : %d \n\n", temp);

            sc.close();
        }
    }
}
