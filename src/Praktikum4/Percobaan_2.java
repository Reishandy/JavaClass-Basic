package Praktikum4;

import java.io.*;

public class Percobaan_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Total belanja anda: ");
        int paid = Integer.parseInt(br.readLine());
        String prize;

        if (paid >= 2000000) {
            prize = "Kompor Gas";
        } else if (paid >= 1000000) {
            prize = "Teflon";
        } else if (paid >= 500000) {
            prize = "Piring";
        } else {
            prize = "Harapan untuk menang (tidak dapat apa-apa)";
        }

        System.out.println("Selamat anda mendapatkan " + prize);
    }
}
