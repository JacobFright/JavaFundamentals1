import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        String fullName;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a first and last name: ");
            fullName = keyboard.nextLine();

            firstNames.add(fullName.substring(0, fullName.indexOf(" ")));
            lastNames.add(fullName.substring(fullName.indexOf(" ") + 1));
        }

        for (String firstName : firstNames) {
            for (String lastName : lastNames) {
                System.out.println(firstName + " " + lastName);
            }
        }
    }
}