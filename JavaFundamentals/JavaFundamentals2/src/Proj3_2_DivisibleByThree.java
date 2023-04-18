import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int valueToBeDivided;
        System.out.println("Enter an integer to divide by three: ");
        valueToBeDivided = keyboard.nextInt();

        if(valueToBeDivided % 3 == 0){
            System.out.println(valueToBeDivided + " is divisible by 3!");
        }
        else{
            System.out.println(valueToBeDivided + " is NOT divisible by 3!");
        }
    }
}

