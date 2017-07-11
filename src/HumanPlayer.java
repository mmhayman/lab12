import java.util.Scanner;

/**
 * Created by michelhayman on 7/10/17.
 */
public class HumanPlayer extends Player {

    @Override
    public Roshambo generateRoshambo() {
        Scanner scan = new Scanner(System.in);

        String input = " ";
        System.out.println();
        System.out.print("Choose Rock, paper, or scissors? (R/P/S)");
        input = scan.nextLine();
        Roshambo choice = null;

        while (!input.equalsIgnoreCase("r") && (!input.equalsIgnoreCase("p")) && (!input.equalsIgnoreCase("s"))) {

            System.out.println("Invalid entry, please try again (r/p/s)");
            input = scan.nextLine();

        }

        if (input.equalsIgnoreCase("r")) {
            choice = Roshambo.ROCK;
        } else if (input.equalsIgnoreCase("p")) {
            choice = Roshambo.PAPER;
        } else if (input.equalsIgnoreCase("s")) {
            choice = Roshambo.SCISSORS;
        }
        return choice;
    }
}
