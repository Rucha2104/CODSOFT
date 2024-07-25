//Task 1: Java program to generate random number and ask user to guess the number.
//        Compare the user's guess with the generated number and provide feedback on whether the guess is correct, too high, or too low.
// Codsoft Internship
// Name: Rucha Chavan

import java.util.Scanner;
import java.util.Random;
public class Main {
    private static final int attempts = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int totalRounds = 0;
        int totalAttempts = 0;
        int totalWins = 0;

        boolean playAgain = true;

        while (playAgain) {
            int PCinput = rand.nextInt(1,100);
            int no_of_guess = 0;
            boolean hasWon = false;

            System.out.println("Guess the number between " +1 + " and " + 100 + ":");

            while (no_of_guess < attempts) {
                System.out.print("Enter your guess: ");
                int UserGuess = sc.nextInt();
                no_of_guess++;
                totalAttempts++;

                if (UserGuess == PCinput) {
                    System.out.println("Congratulations! You've guessed the correct number!");
                    hasWon = true;
                    totalWins++;
                    break;
                } else if (UserGuess < PCinput) {
                    System.out.println("Too low! ..... Guess the bigger number");
                } else {
                    System.out.println("Too high!........Guess the smaller number");
                }
            }

            if (!hasWon) {
                System.out.println("Sorry :( Your attempts are finished. The correct guess was " + PCinput);
            }

            totalRounds++;
            System.out.println("Your score: " + totalWins + " wins out of " + totalAttempts + " rounds.");

            System.out.print("Do you like to play again? (yes/no): ");
            String response = sc.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println(" Your final score: " + totalWins + " wins out of " + totalRounds + " rounds.");
        sc.close();
    }
}


