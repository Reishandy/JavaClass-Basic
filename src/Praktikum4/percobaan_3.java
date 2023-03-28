package Praktikum4;

import java.io.*;

public class percobaan_3 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Masukkan angka: ");
       int angka = Integer.parseInt(br.readLine());
       switch (angka) {
           case 1:
               System.out.println("Hari Senin");
               break;
           case 2:
               System.out.println("Hari Selasa");
               break;
           case 3:
               System.out.println("Hari Rabu");
               break;
           case 4:
               System.out.println("Hari Kamis");
               break;
           case 5:
               System.out.println("Hari Jum'at");
               break;
           case 6:
               System.out.println("Hari Sabtu");
               break;
           case 7:
               System.out.println("Hari Minggu");
               break;
           default:
               System.out.println("Angka tidak diketahui");
       }

    }
}
