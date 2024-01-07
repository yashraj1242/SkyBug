import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Number Game!");

        while (true) {
            // Step 1: Generate a random number within the specified range
            int secretNumber = random.nextInt(100) + 1;

            // Step 5: Set the maximum number of attempts
            int maxAttempts = 10;
            int attempts = 0;

            while (attempts < maxAttempts) {
                // Step 2: Prompt the user to enter their guess
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();

                // Step 3: Compare the user's guess with the generated number
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number " + secretNumber +
                            " correctly in " + (attempts + 1) + " attempts.");
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                attempts++;
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. " +
                        "The correct number was " + secretNumber + ".");
            }

            // Step 6: Ask the user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
