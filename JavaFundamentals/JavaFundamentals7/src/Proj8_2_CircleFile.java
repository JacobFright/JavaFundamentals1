import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circles = readCircleData("circle_data.txt");
        writeToFile(circles);
        for(Circle cir : circles){
            printCircleData(cir);
        }

    }

    public static ArrayList<Circle> readCircleData(String filePath) {
        ArrayList<Circle> circles = new ArrayList<>();

        try {
            Scanner recFile = new Scanner(new File(filePath));
            String tmp;

            while (recFile.hasNextLine()) {
                tmp = recFile.nextLine();
                circles.add(new Circle(Double.parseDouble(tmp)));
            }
            recFile.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return circles;
    }

    public static void printCircleData(Circle circle) {
        System.out.println("Circle: ");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.area());
        System.out.println("Circumference: " + circle.circumference());
        System.out.println();
    }
    public static void writeToFile(ArrayList<Circle> circles) {
        PrintWriter pw;

        try {
            pw = new PrintWriter("circle_out.txt");
            for (Circle circle : circles) {
                pw.println("Circle: ");
                pw.println("Radius: " + circle.getRadius());
                pw.println("Area: " + circle.area());
                pw.println("Circumference: " + circle.circumference());
                pw.println();
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
