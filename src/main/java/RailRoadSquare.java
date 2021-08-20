import java.util.ArrayList;
import java.util.Scanner;

public class RailRoadSquare extends Square {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";

    private Scanner scanner = new Scanner(System.in);
    private String choice;
    private int rent;
    private int price;

    public RailRoadSquare(Type type, String name, int position, int rent, int price) {
        super(type, name, position);
        this.rent = rent;
        this.price = price;
    }

    @Override
    void doTask(ArrayList<Player> player, int order, int numberOfSquare, int jailPosition) {
        if (this.hasOwner() == 0) {
            if (player.get(order).getMoney() >= price) {
                System.out.println(ANSI_CYAN + "Do you want to buy? (Y/N)" + ANSI_RESET);
                System.out.println(ANSI_CYAN + "The price is " + price + "M!" + ANSI_RESET);
                choice = scanner.nextLine();
                if (choice.contains("y") || choice.contains("Y")) {
                    player.get(order).decreaseMoney(price);
                    this.setOwner(player.get(order));
                    System.out.println(ANSI_CYAN + player.get(order).getName() + " have bought " + this.getName() + "!" + ANSI_RESET);
                } else {
                    System.out.println(ANSI_CYAN + player.get(order).getName() + " have not bought " + this.getName() + "!" + ANSI_RESET);
                }
            } else {
                System.out.println(ANSI_CYAN + "Your money is not enough to buy!" + ANSI_RESET);
            }
        } else if (this.getOwner() == player.get(order)) {
            System.out.println(ANSI_CYAN + "Welcome, It's your Rail Road Station!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_CYAN + "There is an owner " + this.getOwner().getName() + ", you have to pay rent! The rent is: " + rent + "M" + ANSI_RESET);
            if (player.get(order).getMoney() >= rent) {
                player.get(order).decreaseMoney(rent);
                this.getOwner().increaseMoney(rent);
            } else {
                System.out.println(ANSI_CYAN + player.get(order).getName() + " is lost!" + ANSI_RESET);
                player.remove(order);
            }
        }

    }
}
