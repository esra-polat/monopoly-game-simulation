import java.util.ArrayList;

public class TaksimAvenue extends PurchaseAndRentalSquare {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public TaksimAvenue(Type type, String name, int position, int rent, int price, String color) {
        super(type, name, position, rent, price, color);
    }

    public TaksimAvenue() {
    }

    @Override
    void takeProperties(ArrayList<Player> player, int order) {
        System.out.println(ANSI_GREEN + "GoodBye " + player.get(order).getName() + " from Taksim Avenue" + ANSI_RESET);
    }
}
