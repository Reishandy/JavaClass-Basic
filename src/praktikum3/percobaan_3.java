package praktikum3;

public class percobaan_3 {
    public static void main(String[] args) {
        //Operasi Aritmatika
        short x = 6;
        int y = 4;
        float a = 12.5f; //Untuk disimpan ke float bukan double
        float b = 7f;

        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x + y = " + (x + y)); //Harus dalam kurung karena jika tidak akan disatukan secara biasa
        System.out.println("x - y = " + (x - y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a / b = " + (a / b)); //Karena salah satu sudah float maka hasil akan berebentuk decimal
        System.out.println("x / b = " + (x / b));
        System.out.println("b / x = " + (b / x));
    }
}
