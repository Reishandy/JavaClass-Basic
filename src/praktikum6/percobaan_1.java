package praktikum6;

import java.util.Scanner;

public class percobaan_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;

        System.out.print("Masukkan nilai ujian (0-100): ");
        score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 90 && score <= 100) {
                System.out.println("Nilai anda A, EXCELLENT!!!");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Nilai anda B, Pertahankan prestasi anda.");
            } else if (score >= 60 && score <= 79) {
                System.out.println("Nilai anda C, Tingkatkan prestasi anda.");
            } else if (score >= 50 && score <= 59) {
                System.out.println("Nilai anda D, Tingkatkan belajar anda!");
            } else {
                System.out.println("Nilai anda E, Tidak lulus.");
            }
        } else {
            System.out.println("Nilai yang anda masukkan tidak valid");
        }

        sc.close();
    }
}
