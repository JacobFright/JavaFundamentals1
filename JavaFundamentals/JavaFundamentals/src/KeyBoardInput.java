import java.util.Scanner;
public class KeyBoardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double number;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("What is your number?");
        number = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Number multiplied by two is: " + (number * 2));

        System.out.println("What is your city?");
        city = keyboard.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Age is " + age);
        System.out.println("City is " + city);

    }
}
