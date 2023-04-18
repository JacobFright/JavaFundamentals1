import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int numToGuess = random.nextInt(100) + 1;
        int guess, guessCounter = 1;

        System.out.println("Guess a number between 1 and 100");
        guess = keyboard.nextInt();

        while (guess != numToGuess){
            if(guess == numToGuess){
                break;
            }
            else if(guess < 1 || guess > 100){
                System.out.println("That was a wasted guess pick a number between 1 and 100");
            } else if (guess > numToGuess) {
                System.out.println("Your guess was too high");
            }
            else{
                System.out.println("Your guess was too low");
            }

            guessCounter++;
            System.out.println("Guess a number between 1 and 100");
            guess = keyboard.nextInt();
        }

        System.out.println("Congratulations you guess the number in " + guessCounter + " guesses!");
        System.out.println("Thanks for playing!");
    }
}
