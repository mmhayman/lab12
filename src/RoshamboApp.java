
import java.util.Scanner;

/**
 * Created by michelhayman on 7/10/17.
 */
public class RoshamboApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String choice = "y";

        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println();

        System.out.print("Please enter your name: ");
        HumanPlayer name1 = new HumanPlayer();
        String userName = name1.getName();


        while (choice.equalsIgnoreCase("y")) {

            System.out.println();
            String playerchoice = "";

            System.out.print("Who would you like to play against Autoplayer 1 or Autoplayer 2 (A1/A2): ");
            playerchoice = scan.nextLine();

            while (!playerchoice.equalsIgnoreCase("A1") && (!playerchoice.equalsIgnoreCase("A2"))) {


                System.out.print("Invalid entry, please try again (A1/A2)");
                playerchoice = scan.nextLine();
                System.out.println();

            }

            AutoPlayer1 player1 = new AutoPlayer1();
            AutoPlayer2 player2 = new AutoPlayer2();
            HumanPlayer player3 = new HumanPlayer();

            Roshambo playerSelection = player3.generateRoshambo();
            Roshambo computerSelection1 = player1.generateRoshambo();
            Roshambo computerSelection2 = player2.generateRoshambo();


            if (playerchoice.equalsIgnoreCase("A1")) {
                System.out.println();
                System.out.println("Autoplayer 1: " + computerSelection1);
                System.out.println(userName + " : " + playerSelection);

                if (playerSelection.equals(computerSelection1)) {
                    System.out.println("Draw!");
                } else if (playerSelection.toString().equalsIgnoreCase("Scissors")) {
                    System.out.println(userName + " loses!");
                } else if (playerSelection.toString().equalsIgnoreCase("Paper")) {
                    System.out.println(userName + " wins!");
                }
            }

            if (playerchoice.equalsIgnoreCase("A2")) {

                System.out.println();
                System.out.println("Autoplayer 2: " + computerSelection2);
                System.out.println(userName + " :  " + playerSelection);


                if (playerSelection.equals(computerSelection2)) {
                    System.out.println("Draw!");
                } else if (playerSelection.toString().equalsIgnoreCase("Scissors")) {
                    if (computerSelection2.toString().equalsIgnoreCase("Rock")) {
                        System.out.println(userName + " loses!");
                    } else {
                        System.out.println(userName + " wins!");
                    }
                } else if (playerSelection.toString().equalsIgnoreCase("Paper")) {
                    if (computerSelection2.toString().equalsIgnoreCase("Rock")) {
                        System.out.println(userName + " wins!");
                    } else {
                        System.out.println(userName + " loses");
                    }
                } else if (playerSelection.toString().equalsIgnoreCase("Rock")) {
                    if (computerSelection2.toString().equalsIgnoreCase("Paper")) {
                        System.out.println(userName + " loses!");
                    } else {
                        System.out.println(userName + " wins!");

                    }
                }
            }


            System.out.println();
            System.out.print("Play again? (y/n)");
            choice = scan.nextLine();
            choice.toLowerCase();
        }

        System.out.println();
        System.out.println("Goodbye!");
    }
}




