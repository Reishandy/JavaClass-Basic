package uts_B;

import java.util.Scanner;

public class menu_rendang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "===================";
        System.out.println("\nRumah makan padang");
        System.out.println(line);
        System.out.println("No  Menu");
        System.out.println(line);
        System.out.println("1.  Rendang");
        System.out.println("2.  Peyek udang");
        System.out.println("3.  Telur dadar");
        System.out.println("4.  Paru goreng");
        System.out.println(line);

        int choice = 0;
        while (true) {
            System.out.print("> Silahkan pilih pesanan anda: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 5 && choice > 0) {
                    break;
                } else {
                    System.out.println("> Pilih antara 1-4");
                }
            } catch (Exception numberFormatException) {
                System.out.println("> Input harus berupa angka");
                continue;
            }
        }

        String food = "";
        switch (choice) {
            case 1:
                food = "Rendang";
                break;
            case 2:
                food = "Peyek udang";
                break;
            case 3:
                food = "Telur dadar";
                break;
            case 4:
                food = "Paru goreng";
                break;
        }

        System.out.println(line);
        System.out.println("Anda memilih " + food);
        System.out.println(line);
        sc.close();
    }
}
