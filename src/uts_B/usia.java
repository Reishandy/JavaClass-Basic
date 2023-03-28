package uts_B;

import java.util.Scanner;

public class usia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        while (true) {
            System.out.print("> Masukkan umur: ");
            try {
                age = Integer.parseInt(sc.nextLine());
                if (age >= 0) {
                    break;
                } else {
                    System.out.println("> Mustahil");
                }
            } catch (Exception numberFormatException) {
                System.out.println("> Input harus berupa angka");
                continue;
            }
        }

        System.out.print("Tergolong kategori ");

        
        if (age < 2) {
            System.out.println("'Bayi'");
        } else if (age < 11) {
            System.out.println("'Anak-Anak'");
        } else if (age < 20) {
            System.out.println("'Remaja'");
        } else if (age < 61) {
            System.out.println("'Dewasa'");
        } else {
            System.out.println("'Lanjut usia'");
        } 

        sc.close();
    }
}
