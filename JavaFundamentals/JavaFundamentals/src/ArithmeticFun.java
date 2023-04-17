public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int result = a + b;
        int differnece = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println("Result is " + result);
        System.out.println("Diff is " + differnece);
        System.out.println("Product is " + product);
        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + remainder);

        result += 20;
        System.out.println("Result is now " + result);

        result++;
        System.out.println("Result++ : " + result);

        result--;
        System.out.println("Result-- : " + result);

        product *= 2;
        System.out.println("Product multiply by 2: " + product);
    }
}
