package praktikum3;


public class rata2 {
    public static void main(String[] args) {
        int[] angka = {30, 75, 90}; // Menggunakan Array

        // Menentukan jumlah
        int sum = 0;
        for (int i : angka) {
            sum += i;
        }

        System.out.println("Rata-rata dari 30, 75, dan 90 adalah: " + sum / angka.length); // Hasil dibagi isi array
    }
}
