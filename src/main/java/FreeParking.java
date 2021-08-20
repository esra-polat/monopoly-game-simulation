import java.util.ArrayList;

public class FreeParking extends Square {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public FreeParking(Type type, String name, int position) {
        super(type, name, position);
    }

    @Override
    void doTask(ArrayList<Player> player, int order, int numberOfSquare, int jailPosition) {
        System.out.println(ANSI_YELLOW + ">> Free Parking!!" + ANSI_RESET);
    }
}
