public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream choc = new IceCream("Chocolate", 2,3);

        choc.addTopping("Sprinkles");
        choc.addTopping("Cream");

        printIC(choc);
    }

    public static void printIC(IceCream iceCream){
        System.out.println("Icecream flavour: " + iceCream.getName());
        System.out.println("Scoops: " + iceCream.getNumScoops());
        System.out.println("Toppings: ");
        iceCream.printToppings();
        System.out.println("Total cost: £" + iceCream.getCost());
    }
}
