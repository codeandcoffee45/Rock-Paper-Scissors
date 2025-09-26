import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Enter your choice (Rock, Paper, or Scissors): ");
        String userChoice = scanner.nextLine();

        // Make sure first letter is uppercase for comparison
        userChoice = userChoice.substring(0,1).toUpperCase() + userChoice.substring(1).toLowerCase();

        if (!userChoice.equals("Rock") && !userChoice.equals("Paper") && !userChoice.equals("Scissors")) {
            System.out.println("Invalid choice. Please run the program again.");
            return;
        }

        String computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer chose: " + computerChoice);

        // Determine winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}
