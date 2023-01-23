/* Number Guess Game 
 * By Alexios Rekoutis
 * 1/19/23
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // specify range of integers
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        // create random number for user to guess
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        // initialize ArrayList to store past guesses
        ArrayList<Integer> pastGuesses = new ArrayList<Integer>();

        int guessCount = 0;
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            // check if guess has already been made
            if (pastGuesses.contains(guess)) {
                System.out.println("You've already guessed that number. Try again.");
                continue;
            } else {
                pastGuesses.add(guess);
            }

            // check if guess is correct
            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the number in " + (guessCount + 1) + " tries.");
                break;
            } else if (guess < targetNumber) {
                System.out.println("The number is higher.");
            } else {
                System.out.println("The number is lower.");
            }
            guessCount++;
        }
    }
}
