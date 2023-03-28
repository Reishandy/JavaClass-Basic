package praktikum2;

import java.util.Scanner;

public class luasLingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Inisialisasi scanner input dari system
        double radius = 0;                      //Inisialisasi radius
        final double PHI = 3.14;                //Inisialisasi phi (3.14)

        //Menggunakan while loop untuk merequest angka (keluar jika radius berhasil diinisialisasi)
        while(radius <= 0) {
            System.out.print("> Masukkan radius lingkaran: ");  //Prompt radius

            //Dimasukkan dalam try catch
            try {
                radius = Double.parseDouble(sc.nextLine());       //Menetapkan nilai radius dari string (didapatkan dari scanner) ke double
            } catch (Exception numberFormatException) {           //Jika input bukan angka positif...
                System.out.println("Input harus angka");
                continue;                                         //Maka akan mengulang ke atas untuk input baru
            }
            
            if (radius <= 0) {
                System.out.println("Angka harus lebih dari 0");
            }
        }

        System.out.println("\n> Luas lingkaran adalah: ");                    //Hasil di format hanya menampilkan 2 decimal poin
        System.out.printf("%.2f", PHI * Math.pow(radius, 2));         //Dari (3.14 x (radius x radius))
        sc.close(); //Menutup scanner agar tidak ada resource leak
    }
}
