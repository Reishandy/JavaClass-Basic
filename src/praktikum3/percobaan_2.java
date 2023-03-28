package praktikum3;

public class percobaan_2 {
    public static void main(String[] args) {
        int a = 50;
        double b = 40.5;

        System.out.println("Nilai a adalah " + a);
        System.out.println("Nilai b adalah " + b);

        String a_Converted = String.valueOf(a);
        String b_Converted = String.valueOf(b);

        System.out.println("===Nilai setelah konversi ke-1===");
        System.out.println("Nilai a adalah " + a_Converted);
        System.out.println("Nilai b adalah " + b_Converted);

        int toInt = Integer.parseInt(a_Converted);
        double toDouble = Double.parseDouble(b_Converted);

        System.out.println("===Nilai setelah konversi ke-2===");
        System.out.println("Nilai a adalah " + toInt);
        System.out.println("Nilai b adalah " + toDouble);
    }
}
