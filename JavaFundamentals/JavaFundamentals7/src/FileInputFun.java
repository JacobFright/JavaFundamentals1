import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        int sum = 0;

        try{
            infile = new Scanner(new File("input.txt"));
            int input;

            while(infile.hasNext()){
                input = infile.nextInt();
                System.out.println(input);
                sum += input;
            }
            infile.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot find file!");
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Error reading input file!");
            System.out.println(e.getMessage());
        }

        System.out.println("The sum of the values is: " + sum);
    }
}
