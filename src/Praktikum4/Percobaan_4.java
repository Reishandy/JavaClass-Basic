package Praktikum4;

import java.io.*;

public class Percobaan_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan angka: ");
        double num = Double.parseDouble(br.readLine());

        String result = (num > 0.0) ? "Positif" : "Negatif";
        System.out.println(num + " Adalah bilangan " + result);
    }
}
