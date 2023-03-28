package praktikum8;

public class percobaan_1 {
    public static void main(String[] args) {
        // Pembuatan array ukuran 10
        // arr tidak memiliki isi pada elemenya
        int arr[] = new int[10];

        // Print (Index Value) %s = string pengganti format dengan "Index" dan "Value"
        // '\n' digunakan untuk print line baru
        System.out.printf("%s %5s\n", "Index", "Value");

        // Loop sampai dengan ukuran array (10) (0-9)
        for (int i = 0; i < arr.length; i++) {
            
            // %d = int pengganti format i dan arr[i]
            // angka didepan d menentukan jumlah spasi (%2d)
            System.out.printf("%2d%6d\n", i, arr[i]);
        }
    }
}
