import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] values = new int[5];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter an integer: \t");
            values[i] = keyboard.nextInt();
        }

        for (int num : values) {
            System.out.println(num * 2);
        }
    }
}
