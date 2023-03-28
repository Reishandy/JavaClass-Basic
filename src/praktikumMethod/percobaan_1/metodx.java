package praktikumMethod.percobaan_1;

public class metodx {
    public double luas_lingkaran(int diameter) {
        return Math.PI * Math.pow(diameter/2, 2);
    }

    public void hitungLuasLingkaran(int ruas) {
        double luas = Math.PI * Math.PI * Math.pow(ruas, 2);
        System.out.println(luas);
    }

    public static void main(String[] args) {
        metodx mt = new metodx();
        mt.hitungLuasLingkaran(10);
        System.out.println(mt.luas_lingkaran(20));
        System.exit(0);
    }
}
