package praktikum8;
import java.util.Scanner;
public class percobaan_4 {
    public static void main(String[] args) {
        // menerima input menggunakan method input()
        String[] input = input(); 
        // inisialisasi array dengan jumlah input
        int arr[] = new int[input.length]; 

        // Loop sampai dengan ukuran array 
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.valueOf(input[i]); // Mengkonversi dari string ke int

            // Kemudian print dengan format "Index  0 memiliki elemen 1"
            // %d pengganti format int, '\n' membuat line baru
            System.out.printf("Index %2d memiliki elemen %d\n", i, arr[i]);
        }
    }

    /**
     * menerima input dari scanner dengan format (1 2 3 4 ...)
     * kemudaian dimasukkan ke sebuah array (string)
     * yang elemennya dipecah menggunakan spasi " "
     * dan mengembalikan array input
     */
    public static String[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai (1 2 3 4 ...) : ");
        String input[] = sc.nextLine().split(" ");
        System.out.println();
        sc.close();
        return input;
    }   
}
