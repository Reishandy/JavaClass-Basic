package praktikum3;

public class Perhitungan {
    public static void main(String[] args) {
        // A
        double a = Math.pow(2, 8) + Math.pow(4, 4);             // 2^8 + 4^4
        System.out.println("Hasil dari 2^8 + 4^4 adalah: " + a);

        // B
        double b = Math.pow(2, 2) + (4 / Math.pow(2, 2));       // 2^2 + 4 / 2^2
        System.out.println("Hasil dari 2^2 + 4 / 2^2 adalah: " + b);

        // C
        double x = Math.pow((4 + 3), 2) + Math.pow((3 + 8), 2);      // (4 + 3)^2 + (3 + 8)^2 = 170 = 13.0384
        System.out.println("Nilai x dalam x=√(4 + 3)^2 + (3 + 8)^2 adalah: " + Math.sqrt(x));      
                                   
    }
}
