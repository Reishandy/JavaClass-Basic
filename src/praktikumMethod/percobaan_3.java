package praktikumMethod;

import javax.swing.JOptionPane;

public class percobaan_3 {
    public static void main(String[] args) {
        // mendapatkan input mode dengan JOptionPane.
        int mode = Integer.valueOf(JOptionPane.showInputDialog(
            "Masukkan mode hitung\n1. Persegi panjang\n2. Segitiga\n3. Lingkaran"));
        // pemilihan mode.
        switch (mode) {
            case 1:
                persegiPanjang();
                break;
            case 2:
                Segitiga();
                break;
            case 3:
                Lingkaran();
                break;
            default:
                // jika input tidak sesuai maka akan error dan exit program.
                JOptionPane.showMessageDialog( 
                    null, "Nilai input tidak sesuai", "ERROR", 2);
                System.exit(0);
                break;
        }
    }

    /**
     * Menghitung luas persegi panjang denngan input melalui JOptionPane berformat (p, l) dan mengoutput hasil
     * dengan JOptionPane.
     */
    public static void persegiPanjang() {
        String[] input = JOptionPane.showInputDialog(
            null, "Masukkan panjang dan lebar (p, l)").split(", ");
        int panjang = Integer.valueOf(input[0]);
        int lebar = Integer.valueOf(input[1]);
        int hasil = panjang * lebar;
        JOptionPane.showMessageDialog(
            null, "Luas persegi panjang adalah : " + hasil, "Persegi panjang", 1);
    }
    
    /**
     * Menghitung luas segitiga denngan input melalui JOptionPane berformat (a, t) dan mengoutput hasil
     * dengan JOptionPane.
     */
    public static void Segitiga() {
        String[] input = JOptionPane.showInputDialog(
            null, "Masukkan alas dan tinggi (a, t)").split(", ");
        int alas = Integer.valueOf(input[0]);
        int tinggi = Integer.valueOf(input[1]);
        double hasil = 0.5 * alas * tinggi;
        JOptionPane.showMessageDialog(
            null, "Luas segitiga adalah : " + hasil, "Segitiga", 1);
    }

    /**
     * Menghitung lngkaran panjang denngan input melalui JOptionPane dan mengoutput hasil
     * dengan JOptionPane.
     */
    public static void Lingkaran() {
        int r = Integer.valueOf(JOptionPane.showInputDialog(null, "Masukkan jari2"));
        double hasil = Math.PI * r * r;
        JOptionPane.showMessageDialog(
            null, "Luas lingkaran adalah : " + hasil, "Lingkaran", 1);
    }

}
