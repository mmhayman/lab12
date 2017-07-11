import java.util.Scanner;

/**
 * Created by michelhayman on 7/10/17.
 */
public class HumanPlayer extends Player {

    @Override
    public Roshambo generateRoshambo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Rock, paper, or scissors? (R/P/S)");
        String input = scan.nextLine();
        Roshambo choice = null;

        if (input.equalsIgnoreCase("r")) {
           choice = Roshambo.ROCK;
        }
        else if (input.equalsIgnoreCase("p")) {
            choice = Roshambo.PAPER;
        }
        else if (input.equalsIgnoreCase("s")){
            choice = Roshambo.SCISSORS;
        }
        return choice;
    }
}
