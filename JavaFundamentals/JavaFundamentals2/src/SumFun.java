import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int input;

        System.out.println("Enter a non-negative integer");
        System.out.println("Or negative to exit");
        input = keyboard.nextInt();
        int sum = input;

        while(input >=0){
            System.out.println(sum);

            System.out.println("Enter a non-negative integer");
            System.out.println("Or negative to exit");
            input = keyboard.nextInt();
            sum += input;
        }

        System.out.println("Final sum is " + sum);
    }
}
