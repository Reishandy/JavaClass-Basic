package praktikum5;

import javax.swing.JOptionPane;

public class ujian {
    public static void main(String[] args) {
        String input = "kosong, 0";
        while (true) {
            input = JOptionPane.showInputDialog("Masukkan mahasiswa dan nilai (Name, Score)");
            // Regex untuk mengecek format input
            if (input.matches("[a-zA-Z]+, [0-9]+")) {
                break;
            }
        }

        String[] inputList = input.split(", ");
        String name = inputList[0];
        int nilai = Integer.parseInt(inputList[1]);
        String nilaiHuruf = "";

        System.out.println(name);

        if (nilai > 100) {
            JOptionPane.showMessageDialog(null, "Tidak mungkin......", "impossible", 0);
            System.exit(0);
        } else if (nilai > 85) {
            nilaiHuruf = "A";
        } else if (nilai > 75) {
            nilaiHuruf = "B+";
        } else if (nilai > 65) {
            nilaiHuruf = "B";    
        } else if (nilai > 55) {
            nilaiHuruf = "C+";
        } else if (nilai > 45) {
            nilaiHuruf = "C";
        } else if (nilai > 35) {
            nilaiHuruf = "D";
        } else {
            JOptionPane.showMessageDialog(null, "Kamu tidak lulus!!!", "non...", 2);
            System.exit(1);
        }

        String out = name + " Mendapatkan nilai '" + nilaiHuruf + "' (" + nilai + ")";
        JOptionPane.showMessageDialog(null, out, "Nilai", 1);
    }
}
