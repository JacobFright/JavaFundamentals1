import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String fullName;
        System.out.println("Enter first and last name: ");
        fullName = keyboard.nextLine();

        String firstName, lastName;

        firstName = fullName.substring(0, fullName.indexOf(" "));
        lastName = fullName.substring(fullName.indexOf(" ") + 1);

        System.out.println("The first name is: " + firstName.toUpperCase());
        System.out.println("The last name is: " + lastName.toLowerCase());
    }
}
