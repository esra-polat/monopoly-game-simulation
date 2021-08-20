import java.util.ArrayList;

public class InJailSquare extends Square {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    private int amount;
    private String rule;

    public InJailSquare(Type type, String name, int position, int amount, String rule) {
        super(type, name, position);
        this.amount = amount;
        this.rule = rule;
    }

    @Override
    void doTask(ArrayList<Player> player, int order, int numberOfSquare, int jailPosition) {
        if (player.get(order).getMoney() > amount) {
            System.out.println(ANSI_GREEN + "--> " + player.get(order).getName() + " paid " + amount + "M for getting out of jail!" + ANSI_RESET);
            player.get(order).decreaseMoney(amount);
            player.get(order).setIsInJail(false);
        } else { //çift zar atınca parası artacak mı?
            System.out.println(ANSI_RED + "--> " + player.get(order).getName() + "'s money is not enough for getting out of jail!" + ANSI_RESET);
            int dice3 = new Dice().rollDice();
            int dice4 = new Dice().rollDice();
            if ((dice3 + dice4) % 2 == 0) {
                System.out.println(ANSI_GREEN + "--> " + player.get(order).getName() + " threw double dice and got out out of jail!" + ANSI_RESET);
                player.get(order).setIsInJail(false);
                //zarlar kadar oyuna devam edecek daha sonra bak
            } else {
                System.out.println(ANSI_RED + player.get(order).getName() + " is still in jail!" + ANSI_RESET);
            }
        }
    }
}
