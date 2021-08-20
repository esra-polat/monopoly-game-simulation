import java.util.ArrayList;

public class GoSquare extends Square {

    public GoSquare(Type type, String name, int position) {
        super(type, name, position);
    }

    @Override
    void doTask(ArrayList<Player> player, int order, int numberOfSquare, int jailPosition) {
        // Nothing
    }
}
