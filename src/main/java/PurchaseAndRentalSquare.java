import java.util.ArrayList;
import java.util.Scanner;

public abstract class PurchaseAndRentalSquare extends Square {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    private Scanner scanner = new Scanner(System.in);
    private String choice;
    private int price;
    private int rent;
    private String color;

    public PurchaseAndRentalSquare() {
    }

    abstract void takeProperties(ArrayList<Player> player, int order);

    public PurchaseAndRentalSquare(Type type, String name, int position, int price, int rent, String color) {
        super(type, name, position);
        this.price = price;
        this.rent = rent;
        this.color = color;
    }

    @Override
    void doTask(ArrayList<Player> player, int order, int numberOfSquare, int jailPosition) {
        if (this.hasOwner() == 0) {
            if (player.get(order).getMoney() >= price) {
                System.out.println(ANSI_BLUE + "Do you want to buy? (Y/N)" + ANSI_RESET);
                System.out.println(ANSI_BLUE + "The price is " + price + "M!" + ANSI_RESET);
                choice = scanner.nextLine();
                if (choice.contains("y") || choice.contains("Y")) {
                    player.get(order).decreaseMoney(price);
                    this.setOwner(player.get(order));
                    System.out.println(ANSI_BLUE + player.get(order).getName() + " have bought " + this.getName() + "!" + ANSI_RESET);
                } else {
                    System.out.println(ANSI_BLUE + player.get(order).getName() + " have not bought " + this.getName() + "!" + ANSI_RESET);
                }
            } else {
                System.out.println(ANSI_BLUE + "Your money is not enough to buy!" + ANSI_RESET);
            }
        } else if (this.getOwner() == player.get(order)) {
            System.out.println(ANSI_BLUE + "Welcome, It's your land!" + ANSI_RESET);
            if (this.hasHomeOrHotel() == 0) {
                if (player.get(order).getMoney() >= price) {
                    System.out.println(ANSI_BLUE + "Do you want to build a house? (Y/N)" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "The house building price is " + price + "M!" + ANSI_RESET);
                    choice = scanner.nextLine();
                    if (choice.contains("y") || choice.contains("Y")) {
                        player.get(order).decreaseMoney(price);
                        this.setHomeOrHotel(player.get(order));
                        System.out.println(ANSI_BLUE + player.get(order).getName() + " have built in " + this.getName() + " land!" + ANSI_RESET);
                    }
                } else {
                    System.out.println(ANSI_BLUE + "Your money is not enough to build home or hotel!" + ANSI_RESET);
                }
            }
        } else {
            System.out.println(ANSI_BLUE + "There is an owner " + this.getOwner().getName() + "." + ANSI_RESET);
            if (player.get(order).getMoney() >= rent) {
                if (this.hasHomeOrHotel() == 1) {
                    System.out.println(ANSI_BLUE + "You have to pay rent! The rent is: " + (2 * rent) + "M" + ANSI_RESET);
                    player.get(order).decreaseMoney(2 * rent);
                    this.getOwner().increaseMoney(2 * rent);
                } else {
                    System.out.println(ANSI_BLUE + "You have to pay rent! The rent is: " + rent + "M" + ANSI_RESET);
                    player.get(order).decreaseMoney(rent);
                    this.getOwner().increaseMoney(rent);
                }
            } else {
                System.out.println(ANSI_BLUE + player.get(order).getName() + " is lost!" + ANSI_RESET);
                player.remove(order);
            }
        }
    }
}
