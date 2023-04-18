import java.util.Scanner;
public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        char sex;

        System.out.println("Please enter your sex: M/F");
        sex = keyboard.next().charAt(0);

        System.out.println("Please enter your age: ");
        age = keyboard.nextInt();
        keyboard.nextLine();

        if(age >= 19 && sex == 'M'){
            System.out.println("Congratulations you are eligible");
        }
        else{
            System.out.println("Sorry no can do.");
        }
    }
}
