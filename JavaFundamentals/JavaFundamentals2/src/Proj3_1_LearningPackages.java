import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int pack, courses, cost = 0;
        System.out.println("Which package did you purchase? 1/2/3");
        pack = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many courses did you enroll on this month?");
        courses = keyboard.nextInt();
        keyboard.nextLine();

        switch (pack) {
            case 1:
                cost = 10;
                if (courses > 2) {
                    for (int i = 2; i < courses; i++) {
                        cost += 6;
                    }
                }
                break;
            case 2:
                cost = 12;
                if (courses > 4) {
                    for (int i = 4; i < courses; i++) {
                        cost += 4;
                    }
                }
                break;
            case 3:
                cost = 15;
                if (courses > 6) {
                    for (int i = 6; i < courses; i++) {
                        cost += 3;
                    }
                }
                break;
            default:
                System.out.println("Invalid package selection");
        }
        System.out.println("Total: £" + cost);
    }
}
