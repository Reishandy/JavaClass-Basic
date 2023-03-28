package praktikum5;

import javax.swing.JOptionPane;

public class salesman {
    public static void main(String[] args) {
        Double hasil = 0.0;
        Double jual = 0.0;

        // Jika penjualan adalah 0 atau kurang, minta input lagi 
        while (hasil < 1) {
            try {
                jual = Double.parseDouble(JOptionPane.showInputDialog("Masukkan penjualana hari ini"));
            } catch (Exception numberFormatException) {
                JOptionPane.showMessageDialog(null, "Penjualan harus berbentuk angka.....", "Angka", 2);
                continue;
            }

            if (jual > 5_000_000) {                 // Kondisi ke-3 (Jika penjualan > 5jt)
                hasil = 300_000 + (jual * 0.2);     // 20%
            } else if (jual > 2_000_000) {          // Kondisi ke-2 (Jika 5jt <= penjualan > 2jt)
                hasil = 200_000 + (jual * 0.15);    // 15%
            } else if (jual == 2_000_000) {         // Kondisi ke-1 (Jika penjualan == 2jt)
                hasil = 100_000 + (jual * 0.1);     // 10%
            } else if (jual > 0) {                  // (Jika penjualan < 2jt)
                hasil = 100_000.0;                  // gaji pasti Rp 100.000,00
            } else if (jual == 0) {                                
                JOptionPane.showMessageDialog(null, "Penjualan harus lebih dari Rp 0 kalau mau digaji", "...", 0);
            } else {
                JOptionPane.showMessageDialog(null, "Disuruh jual malah nyolong.....", "Parah....", 0);
            }
        }

        String out = String.format("%,.2f", hasil); // Format gaji menjadi 100,000.00
        JOptionPane.showMessageDialog(null, "Total gaji anda hari ini adalah: Rp " + out, "Gaji", 1);
    }
}
