import java.util.Scanner;

public class RepetitionFun {
    public static void main(String[] args) {
        int count = 0;

        Scanner keyboard = new Scanner(System.in);
        int input;

        System.out.println("Enter a non-negative integer");
        System.out.println("Or negative to exit");
        input = keyboard.nextInt();

        while(input >=0){
            System.out.println(input);

            System.out.println("Enter a non-negative integer");
            System.out.println("Or negative to exit");
            input = keyboard.nextInt();
        }

        System.out.println("Done!");

//        while (count < 10) {
//            System.out.println(count);
//            count++;
//        }

//        do {
//            System.out.println(count);
//            count++;
//        }
//        while (count < 10);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
    }

}
