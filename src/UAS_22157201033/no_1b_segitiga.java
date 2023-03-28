package UAS_22157201033;

import javax.swing.JOptionPane;

public class no_1b_segitiga {
    public static void main(String[] args) {
        double alas = 0.0, tinggi = 0.0, luas = 0.0;

        while(alas <= 0.0 || tinggi <= 0.0) {
            try {
                alas = Double.valueOf(JOptionPane.showInputDialog(null, "Alas dari segitiga"));
                tinggi = Double.valueOf(JOptionPane.showInputDialog(null, "Tinggi dari segitiga"));
            } catch (Exception e) {
                continue;
            }
        }
        luas = (alas * tinggi) * 0.5; 
        JOptionPane.showMessageDialog(null, "Luas segitiga adalah : " + luas, null, 1);
    }
}
