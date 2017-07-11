/**
 * Created by michelhayman on 7/10/17.
 */
public class AutoPlayer2 extends Player {

    @Override
    public Roshambo generateRoshambo() {

        int randomNum = (int) (Math.random() * 2);

        switch (randomNum) {
            case 0:
                return Roshambo.ROCK;
            case 1:
                return Roshambo.PAPER;
            case 2:
                return Roshambo.SCISSORS;
            default:
                System.out.println("Something went wrong");
                break;
        }

        return null;
    }
}
