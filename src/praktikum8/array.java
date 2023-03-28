package praktikum8;

public class array {
    public static void main(String[] args) {
        int amount = 0;
        try {
            amount = Integer.valueOf(args[0]);
            if (amount < 1) {
                System.out.println("Size must be more than 0");
                System.exit(2);
            }
        } catch (Exception e) {
            System.out.println("usage : array.java size");
            System.exit(1);
        }

        int[] array = new int[amount];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.printf("Index %d memiliki elemen %d\n", i, array[i]);
        }
    }
}