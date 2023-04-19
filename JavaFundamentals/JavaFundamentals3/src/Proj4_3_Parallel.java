import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] ages = new int[5];
        String[] names = new String[5];

        for(int i = 0; i < 5; i++){
            System.out.print("Enter a name: ");
            names[i] = keyboard.nextLine();
            System.out.print("Enter an age: ");
            ages[i] = keyboard.nextInt();
            keyboard.nextLine();
        }
        for(int j = 0; j < 5; j++){
            System.out.println(names[j] + " is " + ages[j] + " years old.");
        }
    }
}
