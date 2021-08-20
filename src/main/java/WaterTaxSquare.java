import java.util.ArrayList;

public class WaterTaxSquare extends Square {

    private int amount;
    private String rule;

    public WaterTaxSquare(Type type, String name, int position, int amount, String rule) {
        super(type, name, position);
        this.amount = amount;
        this.rule = rule;
    }

    @Override
    void doTask(ArrayList<Player> player, int order, int numberOfSquare, int jailPosition) {
        player.get(order).decreaseMoney(amount);
    }
}
