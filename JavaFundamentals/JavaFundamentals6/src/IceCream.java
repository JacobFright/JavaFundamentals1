import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost, numScoops;
    private ArrayList<String> toppings;

    public IceCream(String name, int cost, int numScoops){
        this.cost = cost;
        this.name = name;
        this.numScoops = numScoops;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping){
        toppings.add(topping);
    }
    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void printToppings(){
        for(String top : toppings){
            System.out.println("\t" + top);
        }
    }
}
