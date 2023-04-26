import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Bob");
        names.add("Harry");
        names.add("Jeff");
        names.add("Stan");
        names.add("Esmerelda");

        try{
            PrintWriter pw = new PrintWriter("outputNames.txt");
            for(String name : names){
                pw.println(name);
            }
            pw.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Couldn't write to the file");
        }
    }
}
