package praktikum6_2;

import java.util.Scanner;

public class percobaan_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, total = 0, count = 0;
        double avg, sum;

        System.out.println("===== Loop with continue =====");
        for (int i = 0; i < 5; i++) {
            System.out.print("Input number: ");
            number = sc.nextInt();
            if (number >= 50) continue;
            total += number;
            count++;
        }

        sum = (double) total;
        avg = (double) total / count; 
        System.out.printf("The sum of number less than 50 is %.2f \n", sum);
        System.out.printf("The avarage of number less than 50 is %.2f \n", avg);
        sc.close();
    }
}
