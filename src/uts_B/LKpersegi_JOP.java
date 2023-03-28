package uts_B;

import javax.swing.JOptionPane;

public class LKpersegi_JOP {
    public static void main(String[] args) {
        int sisi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang sisi persegi"));

        String out = "Luas persegi adalah: " + sisi * sisi + "\nKeliling persegi adalah: " + sisi * 4;
        JOptionPane.showMessageDialog(null, out, "Luas dan keliling persegi", 1);
    }
}
