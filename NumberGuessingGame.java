import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Create a Random object to generate a random number
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100

        int guess;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");

        // Loop until the player guesses the correct number
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            numberOfTries++;

            // Check if the guess is too low, too high, or correct
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                System.out.println("It took you " + numberOfTries + " tries.");
                hasGuessedCorrectly = true; // Exit the loop once the correct guess is made
            }
        }

        // Close the scanner
        sc.close();
    }
}

