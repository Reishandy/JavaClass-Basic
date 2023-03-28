package praktikum6_2;

import java.util.Scanner;

public class percobaan_1 {
    public static void main(String[] args) {
        int number, factorial;
        Scanner sc = new Scanner(System.in);

        // For loop
        System.out.println("===== Factorial calculation with 'For' Loop =====");
        System.out.print("Input number: ");
        number = sc.nextInt();
        factorial = 1;

        for (int i = 1; i <= number; i++) {
            System.out.printf("%d x %d = %d\n", factorial, i, (factorial*i));
            factorial *= i;
        }
        System.out.printf("The factorial of %d is : %s \n\n", number, String.format("%,d", factorial));

        // While loop
        System.out.println("===== Factorial calculation with 'While' Loop =====");
        System.out.print("Input number: ");
        number = sc.nextInt();
        factorial = 1;
        int wI = 1;

        while (wI <= number) {
            System.out.printf("%d x %d = %d\n", factorial, wI, (factorial*wI));
            factorial *= wI;
            wI++;
        }
        System.out.printf("The factorial of %d is : %s \n\n", number, String.format("%,d", factorial));

        // Do While loop
        System.out.println("===== Factorial calculation with 'Do While' Loop =====");
        System.out.print("Input number: ");
        number = sc.nextInt();
        factorial = 1;
        int dwI = 1;

        do {
            System.out.printf("%d x %d = %d\n", factorial, dwI, (factorial*dwI));
            factorial *= dwI;
            dwI++;
        } while (dwI <= number);
        System.out.printf("The factorial of %d is : %s \n\n", number, String.format("%,d", factorial));

        sc.close();
    }
}
