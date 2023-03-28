package UAS_22157201033;

import java.util.Scanner;

public class no_1c_lingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = 0.0, luas = 0.0;

        System.out.println("---Luas Lingkaran---");

        try {
            System.out.print("Jari-jari : ");
            r = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Input hasrus berupa angka lebih dari 0");
            System.exit(2);
        }

        if (r <= 0.0) System.exit(1);

        luas = Math.PI * r * r;
        System.out.printf("Luas Lingkaran adalah : %.2f", luas);
        scanner.close();
    }
}