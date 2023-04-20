public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "bob bobson";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsB = myName.indexOf("b");

        String lastName = myName.substring(4);

        System.out.println("upper is " + upper);
        System.out.println("lower is " + lower);
        System.out.println("b is in position " + whereIsB);
        System.out.println("lastname is " + lastName);
    }
}
