/**
 * Created by michelhayman on 7/10/17.
 */
public enum Roshambo {
    ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors");

    private String enumName ;

    Roshambo(String enumName) {
        this.enumName = enumName;
    }

    @Override
    public String toString() {
        return enumName;
    }
}
