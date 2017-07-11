/**
 * Created by michelhayman on 7/10/17.
 */
public class AutoPlayer1 extends Player {

// this autoplayer always picks rock

    @Override
    public Roshambo generateRoshambo() {
        return Roshambo.ROCK;
    }
}
