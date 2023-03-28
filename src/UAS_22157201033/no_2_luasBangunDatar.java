package UAS_22157201033;

import java.util.Scanner;

public class no_2_luasBangunDatar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mode(scanner);
        scanner.close();
    }

    public static void persegiPanjang(Scanner scanner) {
        System.out.println("---Persegi panjang---");
        double panjang = 0.0, lebar = 0.0, luas = 0.0;

        while (panjang <= 0.0 || lebar <= 0.0) {
            try {
                System.out.print("Panjang : ");
                panjang = Double.valueOf(scanner.nextDouble());
                System.out.print("Lebar : ");
                lebar = Double.valueOf(scanner.nextDouble());
            } catch (Exception e) {
                continue;
            }
        }

        luas = panjang * lebar;
        System.out.printf("Luas persegi panjang adalah : %.2f", luas);
    }

    public static void segitiga(Scanner scanner) {
        System.out.println("---Segitiga---");
        double alas = 0.0, tinggi = 0.0, luas = 0.0;

        while (alas <= 0.0 || tinggi <= 0.0) {
            try {
                alas = Double.valueOf(scanner.nextDouble());
                tinggi = Double.valueOf(scanner.nextDouble());
            } catch (Exception e) {
                continue;
            }
        }
        luas = (alas * tinggi) * 0.5;
        System.out.printf("Luas segitiga adalah : %.2f", luas);
    }

    public static void lingkaran(Scanner scanner) {
        System.out.println("---Lingkaran---");
        double r = 0.0, luas = 0.0;

        while (r <= 0.0) {
            try {
                System.out.print("Jari-jari : ");
                r = scanner.nextDouble();
            } catch (Exception e) {
                continue;
            }
        }

        luas = Math.PI * r * r;
        System.out.printf("Luas Lingkaran adalah : %.2f", luas);
    }

    public static void mode(Scanner scanner) {
        System.out.println("Pilih mode\n1. Persegi panjang\n2. Segitiga\n3. Lingkaran");
        int mode = 0;
        System.out.print("> ");
        try {
            mode = Integer.valueOf(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Input angka");
            System.exit(2);
        }
        switch (mode) {
            case 1:
                persegiPanjang(scanner);
                break;
            case 2:
                segitiga(scanner);
                break;
            case 3:
                lingkaran(scanner);
                break;
            default:
            System.out.println("input di antara 1, 2, 3");
            System.exit(1);
                break;
        }
    }

}
