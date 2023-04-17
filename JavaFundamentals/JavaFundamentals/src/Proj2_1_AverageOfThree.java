import java.util.Scanner;
public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double number1, number2, number3, average;

        System.out.println("Please enter three numbers: ");
        number1 = keyboard.nextDouble();
        number2 = keyboard.nextDouble();
        number3 = keyboard.nextDouble();
        keyboard.nextLine();

        average = (number1 + number2 + number3) / 3.0;

        System.out.println("Average is: " + average);
    }
}
