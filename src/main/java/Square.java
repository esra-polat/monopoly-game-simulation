import java.util.ArrayList;
import java.util.Random;

enum Type {
    GO,
    REGULAR,
    INCOME_TAX,
    ELECTRIC_TAX,
    WATER_TAX,
    IN_JAIL,
    GO_TO_JAIL,
    COMMUNITY_CHEST_CARD,
    CHANCE_CARD,
    BAGDAT_AVENUE,
    ISTIKLAL_AVENUE,
    TAKSIM_AVENUE,
    BEYOGLU_AVENUE,
    RAIL_ROAD,
    FREE_PARKING
}

public abstract class Square {

    private Type type;
    private String name;
    private int position;
    private int hasOwner = 0;
    private Player owner;
    private int hasHomeOrHotel = 0;
    private Player homeOrHotelOwner;
    Random random = new Random();

    abstract void doTask(ArrayList<Player> player, int order, int numberOfSquare, int jailPosition);

    public Square(Type type, String name, int position) {
        this.type = type;
        this.name = name;
        this.position = position;
    }

    public Square() {
    }

    public Player getOwner() {
        return this.owner;
    }

    public void setOwner(Player player) {
        this.owner = player;
        this.hasOwner = 1;
    }

    public int hasOwner() {
        return this.hasOwner;
    }

    public void setHomeOrHotel(Player player) {
        this.homeOrHotelOwner = player;
        this.hasHomeOrHotel = 1;
    }

    public int hasHomeOrHotel() {
        return this.hasHomeOrHotel;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

}
