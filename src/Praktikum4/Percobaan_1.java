package Praktikum4;

import java.io.*;

public class Percobaan_1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in); // Stream reader
        BufferedReader br = new BufferedReader(r);              // Buffered reader (butuh stream reader)

        System.out.print("Masukkan suhu saat ini: ");
        int temp = Integer.parseInt(br.readLine());

        if (temp < 16) {
            System.out.println("Pakailah pakaian yang tebal");
        } else {
            System.out.println("Silahkan memakai pakaian yang ringan");
        }
    }
}
