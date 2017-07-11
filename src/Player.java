import java.util.Scanner;

/**
 * Created by michelhayman on 7/10/17.
 */
public abstract class Player {
    private String name;
    private Roshambo choice;

    public abstract Roshambo generateRoshambo () ;

    public String getName () {
        Scanner scan = new Scanner (System.in);
        name = scan.next();
        return name;
    }

    public Roshambo choice () {
        return choice;
    }

}
