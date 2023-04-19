public class MoreArrayFun {
    public static void main(String[] args) {
        int[] myArray;

        myArray = new int[10];

        for(int i = 1; i <= 10; i++){
            myArray[i - 1] = i;
        }

        for(int num: myArray){
            System.out.println(num);
        }
    }
}
