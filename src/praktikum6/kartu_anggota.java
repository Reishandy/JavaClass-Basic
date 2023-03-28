package praktikum6;

import java.util.Scanner;

public class kartu_anggota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total, discount, paid;
        String membershipCard;

        System.out.print("Apakah pelanggan memiliki kartu anggota (y/n)? ");
        membershipCard = sc.nextLine();
        System.out.print("Berapa total harga barang belanjaan? Rp ");
        total = sc.nextInt();

        if (membershipCard.equals("y")) {
            if (total > 500_000) {
                discount = 50_000;
            } else {
                discount = 25_000;
            }
        } else {
            if (total > 200_000) {
                discount = 10_000;
            } else {
                discount = 0;
            }
        }

        paid = total - discount;
        System.out.println("Total yang harus dibayar: Rp " + paid);
        sc.close();
    }
}
