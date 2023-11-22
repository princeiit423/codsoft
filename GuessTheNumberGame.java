import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Guess the Number game!");

        do {
            // Generate a random number within the specified range
            int secretNumber = (int) (Math.random() * (maxRange - minRange + 1)) + minRange;
            int attempts = 0;

            System.out.println("\nRound " + (rounds + 1) + ":");
            System.out.println("Try to guess the number between " + minRange + " and " + maxRange + ".");

            do {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                // Check if the guess is correct, too high, or too low
                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                // Check if the user has reached the maximum attempts
                if (attempts == maxAttempts) {
                    System.out
                            .println("Sorry, you've run out of attempts. The correct number was " + secretNumber + ".");
                    break;
                }

            } while (true);

            // Ask the user if they want to play another round
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (playAgain.equals("no")) {
                break;
            }

            rounds++;

        } while (true);

        // Display the user's score
        System.out.println(
                "Game over! You played " + rounds + " rounds and took a total of " + totalAttempts + " attempts.");

        // Close the scanner
        scanner.close();
    }
}
