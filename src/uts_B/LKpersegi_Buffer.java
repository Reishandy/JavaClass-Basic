package uts_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LKpersegi_Buffer {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nMaukkan panjang sisi persegi: ");
        int sisi = Integer.parseInt(br.readLine());
        System.out.println("\n====================");

        System.out.println("Luas dari persegi adalah: " + (sisi * sisi));
        System.out.println("Keliling dari persegi adalah: " + (sisi * 4));
    }
}
