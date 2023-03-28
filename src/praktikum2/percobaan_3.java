package praktikum2;

public class percobaan_3 {
    public static void main(String[] args) {
        char k1 = 'A';
        char k2 = '\u0041'; // Bisa menggunakan unicode
        char k3 = 65;       // Atau acii

        char pb = '\n';     // '\' merupakan escape character
        System.out.print(k1);
        System.out.print(k2);
        System.out.print(pb);
        System.out.print(k3);
    }
}
