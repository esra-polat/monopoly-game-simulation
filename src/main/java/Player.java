public class Player {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    private int id;
    private String name;
    private int location;
    private int money;
    private boolean isInJail;

    public Player(int id, String name, int location, int money, boolean isInJail) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.money = money;
        this.isInJail = isInJail;
    }

    public void decreaseMoney(int amount) {
        this.money -= amount;
        if (this.money < 0) {
            this.money = 0;
        }
    }

    public void increaseMoney(int amount) {
        this.money += amount;
    }

    public void goInJail(int location) {
        this.location = location;
    }

    public void setIsInJail(boolean inJail) {
        isInJail = inJail;
        if (inJail) {
            System.out.println(ANSI_RED + "<<<  Opps! IN JAIL :(  >>>\n" + ANSI_RESET);
        } else {
            System.out.println(ANSI_BLUE + "<<<  Whuu! FREEDOM :)  >>>\n" + ANSI_RESET);
        }
    }

    public void setLocationOfPlayer(int totalDiceValue, int numberOfSquare) {
        // When the player reaches the end of the board, s/he returns to the beginning square.
        if (this.location + totalDiceValue >= numberOfSquare) {
            increaseMoney(50);
            this.location = this.location + totalDiceValue - numberOfSquare;
            System.out.println(ANSI_PURPLE + "You won 50M for completing a tour :) Your money: " + this.money + ANSI_RESET);
        } else {
            this.location += totalDiceValue;
        }
    }

    public void setLocationOfPlayer(int newLocation) {
        this.location = newLocation;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public int getMoney() {
        return money;
    }

    public boolean isInJail() {
        return isInJail;
    }

}
