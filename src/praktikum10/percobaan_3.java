package praktikum10;

import java.util.Scanner;

public class percobaan_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai (ex. 5,4) : ");
        String[] input = scanner.nextLine().split(",");
        int x = Integer.parseInt(input[0]), y = Integer.parseInt(input[1]);
        scanner.close();

        int result = operation1(x, y);
        System.out.println("Hasil : " + result);
    }

    public static int operation1(int x, int y) {
        return operation2(x + 7, y + 4);
    }

    public static int operation2(int x, int y) {
        return (x + 10) % (y + 19);
    }
}
