public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);
        int result = giveMe10();
        System.out.println(result);

        result = addThese(3, 5);
        System.out.println(result);

        double square = squareThis(5.5);
        System.out.println(square);
    }

    public static void printHello() {
        System.out.println("Hello there!");
    }

    public static void printNumber(int a) {
        System.out.println("The number is " + a);
    }

    public static int giveMe10() {
        return 10;
    }

    public static int addThese(int num1, int num2) {
        return num1 + num2;
    }

    public static double squareThis(double a) {
        return a * a;
    }
}
