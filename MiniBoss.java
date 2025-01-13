import java.util.Random;
import java.util.Scanner;

public class MiniBoss {
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("You have encoutered a miniboss.");
        System.out.println("To level up, you have to beat it by playing Rock-Paper-Scissors (Best of 3).");
        System.out.println("If you lose, you'll be sent to the entrance.");
        
        String ghost = """
             .-.
            (o o) boo!
          | | O | |
          *-|   /-*
            |  /
            '~~'
        """;
        System.out.println(ghost);
        System.out.println("You mere human want to catch fade? Alright come on then.");

        int playerScore = 0;
        int minibossScore = 0;
        boolean gameRunning = true;

        while (gameRunning && playerScore < 2 && minibossScore < 2) {
            System.out.println("Enter your choice (rock, paper, or scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("If you are this idiot, how dare you challenge me. Please enter rock, paper, or scissors.");
                continue;
            }

            String minibossChoice = choices[random.nextInt(3)];
            
            System.out.println("You chose: " + playerChoice);
            System.out.println("Miniboss chose: " + minibossChoice);

            if (playerChoice.equals(minibossChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && minibossChoice.equals("scissors")) ||
                       (playerChoice.equals("scissors") && minibossChoice.equals("paper")) ||
                       (playerChoice.equals("paper") && minibossChoice.equals("rock"))) {
                System.out.println("You may have beaten me, but this is not over.");
                playerScore++;
            } else {
                System.out.println("of course, you are no match to me.");
                minibossScore++;
            }

            System.out.println("Score: You " + playerScore + " - " + minibossScore + " Computer");
        }

        if (playerScore == 2) {
            System.out.println("You have beaten me, you shall be strong enough to challenge the final boss.");
        } else {
            System.out.println("WEAK!!! Go home buddy.");
        }

        scanner.close();
    }
}

