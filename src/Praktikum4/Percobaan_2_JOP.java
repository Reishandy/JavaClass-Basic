package Praktikum4;

import javax.swing.*;

public class Percobaan_2_JOP {
    public static void main(String[] args) {
        int paid = Integer.parseInt(JOptionPane.showInputDialog("Total belanja anda: "));
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
