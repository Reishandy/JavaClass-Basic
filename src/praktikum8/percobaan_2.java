package praktikum8;

public class percobaan_2 {
    public static void main(String[] args) {
        // Pembuatan array dengan isi
        // Berisi 10, 100, 25, 44, 71, 7, 0
        int arr[] = { 10, 100, 25, 44, 71, 7, 0 };

        // Print (Index Value) %s = string pengganti format dengan "Index" dan "Value"
        System.out.printf("%s %5s\n", "Index", "Value");

        // Loop sampai dengan ukuran array (7) (0-6)
        for (int i = 0; i < arr.length; i++) {

            // %d = int pengganti format i dan arr[i]
            System.out.printf("%2d%6d\n", i, arr[i]);
        }
    }
}
