package UAS_22157201033;

import java.util.Scanner;

public class no_3_konversiNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int nilai = 0;
        String nilaiS = "";

        System.out.print("Masukkan nilai : ");
        try {
            nilai = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input berupa angka");
            System.exit(1);
        }

        // Konversi
        if(nilai < 0) {
            System.out.println("Nilai harus positif...");
            System.exit(1);
        } else if (nilai < 21) {
            nilaiS = "E";
        } else if (nilai < 41) {
            nilaiS = "D";
        } else if (nilai < 61) {
            nilaiS = "C";
        } else if (nilai < 81) {
            nilaiS = "B";
        } else if (nilai < 101) {
            nilaiS = "A";
        } else {
            System.out.println("Nilai harus tidak lebih dari 100...");
            System.exit(2);
        } 

        System.out.printf("Nilai %d mendpatkan %s.", nilai, nilaiS);

        scanner.close();
    }

}
