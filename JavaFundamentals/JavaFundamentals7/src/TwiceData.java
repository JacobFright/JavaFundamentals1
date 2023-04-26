import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner numsFile;
        PrintWriter pw;

        try {
            numsFile = new Scanner(new File("nums.txt"));
            pw = new PrintWriter("twiceFile.txt");
            int tmp;

            while (numsFile.hasNextLine()) {
                tmp = numsFile.nextInt();
                tmp *=2;
                pw.println(tmp);
            }

            numsFile.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
