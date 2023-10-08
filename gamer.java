import java.util.*;

public class gamer {
    public static void numberGame() {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        // given number of trials
        int n = 3;
        // random number generation
        int number = ran.nextInt(100) + 1;
        int i, guess;
        System.out.println("Welcome to the number guessing game..");
        System.out.println("A number is chosen from 1 to 100");
        System.out.println("Guess the number in 3 trials");
        // loop runs until n trials
        for (i = 0; i < n; i++) {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Congrats!!! You guessed it right.");
                break;
            } else if (number > guess && i != n - 1) {
                System.out.println("The number is greater than " + guess);
            } else if (number < guess && i != n - 1) {
                System.out.println("The number is smaller than " + guess);
            }
        }
        if (i == n) { 
            System.out.println("Your " + n + " chances are over.");
            System.out.println("The number was " + number);
        }
    }

    public static void main(String[] args) {
        // call the function
        numberGame();
    }
}