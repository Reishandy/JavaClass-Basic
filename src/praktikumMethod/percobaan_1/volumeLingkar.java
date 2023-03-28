package praktikumMethod.percobaan_1;

public class volumeLingkar {
    public static void main(String[] args) {
        // Meminta input pemilihan mode penghitungan dengan "inputconsole.readInt()".
        System.out.print("Mode penghitungan\n1. tabung\n2. kerucut\n3. bola\n> ");
        int mode = inputconsole.readInt();
        System.out.println("----------");

        // Menggunakan switch-case untuk pelaksanaan perhitungan sesuai dengan pilihan
        // awal.
        switch (mode) {
            case 1:
                tabung(); // Memanggil fungsi tabung line 28.
                break;
            case 2:
                kerucut(); // Memanggil fungsi kerucut line 35.
                break;
            case 3:
                bola(); // Memanggil fungsi bola line 42.
                break;
            default:
                // Menghandle input selain pilihan dan selain angka (dihandle oleh
                // inputconsole).
                System.out.println("Input salah!");
                System.exit(0);
                break;
        }
    }


    /**
     * Fungsi tabung() tidak memiliki keluaran (void), yang berguna untuk menghitung volume
     * sebuah tabung dengan rumus 'PI * r * r * t'. dimana input akan didapatkan dari fungsi
     * inputRT, perhitungan 'PI * r * r' menggunakan fungsi luasLingkaran() dan hasil print
     * akan ditampilkan menggunakan fungsi printResult yang berargument volume hasil perhitungan
     * dan tipe perhitungan.
     */
    public static void tabung() {
        // memanggil inputRT untuk jari2 dan tinggi.
        int[] input = inputRT(false);
        // memishkan jari2 dan tinggi.
        int r = input[0], t = input[1];
        // menghitung volume.
        double volume = luasLingkaran(r) * t; 
        // output.
        printResult("tabung", volume);
    }

    /**
     * Fungsi kerucut() tidak memiliki keluaran (void), yang berguna untuk menghitung volume
     * sebuah kerucut dengan rumus '(1 / 3) * PI * r * r * t'. dimana input akan didapatkan 
     * dari fungsi inputRT, perhitungan 'PI * r * r' menggunakan fungsi luasLingkaran() 
     * dan hasil print akan ditampilkan menggunakan fungsi printResult yang berargument 
     * volume hasil perhitungan dan tipe perhitungan.
     */
    public static void kerucut() {
        // memanggil inputRT untuk jari2 dan tinggi.
        int[] input = inputRT(false);
        // memishkan jari2 dan tinggi.
        int r = input[0], t = input[1];
        // menghitung volume.
        double volume = (0.333) * luasLingkaran(r) * t;
        // output.
        printResult("kerucut", volume);
    }

     /**
     * Fungsi bola() tidak memiliki keluaran (void), yang berguna untuk menghitung volume
     * sebuah kerucut dengan rumus 'PI * r * * r * r * (4 / 3)'. dimana input akan didapatkan 
     * dari fungsi inputRT, perhitungan 'PI * r * r' menggunakan fungsi luasLingkaran() 
     * dan hasil print akan ditampilkan menggunakan fungsi printResult yang berargument 
     * volume hasil perhitungan dan tipe perhitungan.
     */
    public static void bola() {
        // memanggil inputRT untuk jari2 saja.
        int[] input = inputRT(true);
        // mengambil jari2 dari input[].
        int r = input[0];
        // menghitung volume.
        double volume = luasLingkaran(r) * r * (1.333);
        // output.
        printResult("bola", volume);
    }

    /**
     * @param jari2 (lingkaran)
     * @return area of a circle.
     *   Fungsi ini akan mengembalikan luas dari sebuah lingkaran dari jari2.
     */
    public static double luasLingkaran(int jari2) {
        return Math.PI * jari2 * jari2;
    }

    /**
     * @param type (jenis perhitungan).
     * @param volume (hasil perhitungan).
     *   Akan mengoutputkan hasil perhitungan volume dengan 3 digit dibelakang koma.
     */
    public static void printResult(String type, double volume) {
        System.out.printf("Volume %s adalah : %.3f", type, volume);
    }

    /**
     * @param justOne (mengkondisikan jika input hanya jari2 saja atau dengan tinggi).
     * @return array integer yang berisi jari2 dan+ tinggi.
     *   InputRT akan menggunakan inputconsole.readInt dan error handlingnya untuk 
     * mendapatkan input dari console yang kemudian akan mengembalikan nilai jari2
     * dan tinggi (apabila justOne merupakan false).
     */
    public static int[] inputRT(boolean justOne) {
        // inisialisasi array integer.
        int[] retValue = new int[2];
        // mendapatkan input jari2 dan memasukkanya ke array input lokasi 0.
        System.out.print("Masukkan jari2 : ");
        int r = inputconsole.readInt();
        retValue[0] = r;
        // jika parameter justOne 'true' maka langsun keluar dengan return jari2 saja.
        if (justOne) return retValue;
        // jika 'false' maka akan mendapatkan input tinggi dan memasukannya ke array input.
        System.out.print("Masukkan tinggi : ");
        int t = inputconsole.readInt();
        retValue[1] = t;
        // return jari2 dan tinggi.
        return retValue;
    }
}