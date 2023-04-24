public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        System.out.println("C1 radius: " + c1.getRadius());
        c1.setRadius(2.5);

        printCircle(c1);
        printCircle(c2);

    }

    public static void printCircle(Circle circle) {

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + String.format("%.2f", circle.area()));
        System.out.println("Circumference: " + String.format("%.2f", circle.circumference()));
        System.out.println();
    }
}
