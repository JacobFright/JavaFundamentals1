public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 39;
        int yourAge = 20;
        int bobsAge = 20;
        int currentAge = 29;

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        //relational operations
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge?: " + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge?: " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge = bobsAge?: " + ageComparison);

        String myName = "JF";
        String yourName = "Jeff";

        boolean nameComparison = myName.equals(yourName);
        System.out.println("Do names match?: " + nameComparison);

        ageComparison = currentAge >= 21;
        System.out.println("Current age is greater than 21: " + ageComparison);
    }
}
