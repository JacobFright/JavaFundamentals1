import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++) {
            myArrayList.add(i);
        }
        int total = sumElements(myArrayList);
        System.out.println(total);
    }

    public static int sumElements(ArrayList<Integer> array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }
}
