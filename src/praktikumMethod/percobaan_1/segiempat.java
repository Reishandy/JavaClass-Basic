package praktikumMethod.percobaan_1;

public class segiempat {
    public void segiempatM(int panjang, int lebar) {
        double luas = panjang * lebar;
        System.out.println("--------------------------");
        System.out.println("Panjang segi empat = " + panjang);
        System.out.println("Lebar segi empat = " + lebar);
        System.out.println("Luas segi empat = " + luas);
    }

    public static void main(String[] args) {
        segiempat se = new segiempat();
        se.segiempatM(10, 5);
    }
}
