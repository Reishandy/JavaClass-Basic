package praktikum6;

import java.util.Scanner;

public class percobaan_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String category;
        int salary, salaryClean;
        double tax;

        System.out.print("Masukkan kategori (pekerja/pebisnis): ");
        category = sc.nextLine();
        System.out.print("Masukkan besar penghsilan: Rp ");
        salary = sc.nextInt();

        if (category.equalsIgnoreCase("pekerja")) {
            if (salary <= 2_000_000) {
                tax = 0.1;
            } else if (salary <= 3_000_000) {
                tax = 0.15;
            } else {
                tax = 0.2;
            }
            salaryClean = (int) (salary - (salary * tax)); // using (int) for converting the result to integer (from double)
            System.out.println("Gaji bersih yang anda terima: Rp " + String.format("%,d", salaryClean)); // Formatting
        } else if (category.equalsIgnoreCase("pebisnis")) {
            if (salary <= 2_500_000) {
                tax = 0.15;
            } else if (salary <= 3_500_000) {
                tax = 0.2;
            } else {
                tax = 0.25;
            }
            salaryClean = (int) (salary - (salary * tax));
            System.out.println("Gaji bersih yang anda terima: Rp " + String.format("%,d", salaryClean));
        } else {
            System.out.println("Kategori yang anda masukkan salah.");
        }

        sc.close();
    }
}
