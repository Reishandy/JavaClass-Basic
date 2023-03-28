package Praktikum4;

import javax.swing.*;

public class Percobaan_4_JOP {
    public static void main(String[] args) {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Masukkan angka"));

        String result = (num > 0.0) ? "Positif" : "Negatif";
        System.out.println(num + " Adalah bilangan " + result);
    }
}
