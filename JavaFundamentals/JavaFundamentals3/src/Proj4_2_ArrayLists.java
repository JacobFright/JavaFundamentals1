import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> myArrayList = new ArrayList<>();
        double input = 1;

        while(input > 0){
            System.out.println("Enter a positive number");
            System.out.println("Enter a negative number to exit");
            input = keyboard.nextDouble();
            myArrayList.add(input);
        }

        for(int i = myArrayList.size() -1 ; i >= 0; i--){
            System.out.println(myArrayList.get(i));
        }
    }
}
