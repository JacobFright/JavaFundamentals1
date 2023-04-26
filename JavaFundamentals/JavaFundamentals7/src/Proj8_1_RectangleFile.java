import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = readRectangleData("rectangle_data.txt");
        writeToFile(rectangles);
        for(Rectangle rec : rectangles){
            printRectangleData(rec);
        }
    }

    public static ArrayList<Rectangle> readRectangleData(String filePath) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        try {
            Scanner recFile = new Scanner(new File(filePath));
            String tmp;

            while (recFile.hasNextLine()) {
                tmp = recFile.nextLine();
                rectangles.add(new Rectangle(
                        Double.parseDouble(tmp.substring(0, tmp.indexOf(" "))),
                        Double.parseDouble(tmp.substring(tmp.indexOf(" ") + 1))));
            }
            recFile.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return rectangles;
    }

    public static void printRectangleData(Rectangle rec) {
        System.out.println("Rectangle: ");
        System.out.println("Length: " + rec.getLength());
        System.out.println("Width: " + rec.getWidth());
        System.out.println("Area: " + rec.area());
        System.out.println("Perimeter: " + rec.perimeter());
        System.out.println();
    }

    public static void writeToFile(ArrayList<Rectangle> rectangles) {
        PrintWriter pw;

        try {
            pw = new PrintWriter("rectangle_out.txt");
            for (Rectangle rec : rectangles) {
                pw.println("Rectangle: ");
                pw.println("Length: " + rec.getLength());
                pw.println("Width: " + rec.getWidth());
                pw.println("Area: " + rec.area());
                pw.println("Perimeter: " + rec.perimeter());
                pw.println();
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
