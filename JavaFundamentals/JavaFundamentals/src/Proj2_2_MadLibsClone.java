import java.util.Scanner;
public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String adj1, adj2, adj3, girlsName, place, cloth, hobby, occupation1, occupation2, boysName, mansName;

        System.out.println("Enter an Adjective: ");
        adj1 = keyboard.nextLine();
        System.out.println("Enter a girls name: ");
        girlsName = keyboard.nextLine();
        System.out.println("Enter another adjective: ");
        adj2 = keyboard.nextLine();
        System.out.println("Enter an occupation: ");
        occupation1 = keyboard.nextLine();
        System.out.println("Enter a place name: ");
        place = keyboard.nextLine();
        System.out.println("Enter a piece of clothing: ");
        cloth = keyboard.nextLine();
        System.out.println("Enter a hobby: ");
        hobby = keyboard.nextLine();
        System.out.println("Enter another adjective: ");
        adj3 = keyboard.nextLine();
        System.out.println("Enter another occupation: ");
        occupation2 = keyboard.nextLine();
        System.out.println("Enter a boys name: ");
        boysName = keyboard.nextLine();
        System.out.println("Enter a mans name: ");
        mansName = keyboard.nextLine();

        System.out.println("There once was a " + adj1 + " girl named " + girlsName + "who was a "
        + adj2 + " " + occupation1 + " in the kingdom of " + place + ".");

        System.out.println("She loved to wear " + cloth + " and to " + hobby + ". She wanted to marry " +
                adj3 + " " + occupation2 + " named " + boysName + " but her father, King " + mansName +
                " forbid her from seeing him.");

    }
}
