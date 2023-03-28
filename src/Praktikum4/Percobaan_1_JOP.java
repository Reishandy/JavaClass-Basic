package Praktikum4;

import javax.swing.JOptionPane;

public class Percobaan_1_JOP {
    public static void main(String[] args) {
        int temp = Integer.parseInt(JOptionPane.showInputDialog("Masukkan suhu"));

        if (temp < 16) {
            System.out.println("Pakailah pakaian yang tebal");
        } else {
            System.out.println("Silahkan memakai pakaian yang ringan");
        }
    }
}
