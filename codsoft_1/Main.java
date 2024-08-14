// CODSOFT TASK NO. 1 -> NUMBER GUESSING GAME
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tries = 0;
        final int MIN_GUESS = 1;
        final int MAX_GUESS = 100;
        final int MAX_TRIES = 10;
        Scanner sc = new Scanner(System.in);
        int r = (int) ((Math.random() * 100) + 1);
        boolean gameRunning = true;
        System.out.println("WELCOME TO THE NUMBER GUESSER!");
        while (gameRunning) {
            System.out.println("Enter your guess 1-100: ");
            int guess = sc.nextInt();
            if (guess >= MIN_GUESS && MAX_GUESS >= guess && MAX_TRIES > tries) {
                if (guess == r) {
                    tries++;
                    int score = 1000 - (tries * 100);
                    System.out.println("You guessed it correctly in " + tries + " tries!");
                    System.out.println("Your score is: " + score);
                    gameRunning = false;
                } else if (guess > r) {
                    tries++;
                    System.out.println("Guess is higher than the number. You have tried " + tries + " times.");
                } else {
                    tries++;
                    System.out.println("Your guess is too low. You have tried " + tries + " times.");
                }
            } else if (MAX_TRIES <= tries) {
                System.out.println("You have reached the max tries, Start a new game.");
                gameRunning = false;
            } else {
                System.out.println("Invalid choice, number out of range.");
            }

        }
        sc.close();
    }
}
