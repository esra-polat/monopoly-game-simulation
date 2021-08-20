import java.util.ArrayList;

public class CommunityChestCardSquare extends Square {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    private String[] communityChestCard = new String[]{
            "Take 25M for consulting fee.", //0
            "Pay 100M for hospital bills.", //1
            "Take 100M for annual interest payment.", //2
            "Pay 50M for doctor's fee.", //3
            "Pay 50M for tuition fee.", //4
            "Error in bank account! Take 200M.", //5
            "Your payment came from insurance! Take 100M.", //6
            "You inherit 100M.", //7
            "You have won second prize in a beauty contest collect 10M.", //8
            "You won 50M from sale of stock.", //9
    };

    public CommunityChestCardSquare(Type type, String name, int position) {
        super(type, name, position);
    }

    @Override
    void doTask(ArrayList<Player> player, int order, int numberOfSquare, int jailPosition) {

        int randomCommunityChestCard = random.nextInt(9) + 1;

        if (randomCommunityChestCard == 0) {
            System.out.println(ANSI_PURPLE + "--------------------------------");
            System.out.println("| Take 25M for consulting fee. |");
            System.out.println("--------------------------------" + ANSI_RESET);
            player.get(order).increaseMoney(25);
        } else if (randomCommunityChestCard == 1) {
            System.out.println(ANSI_PURPLE + "--------------------------------");
            System.out.println("| Pay 100M for hospital bills. |");
            System.out.println("--------------------------------" + ANSI_RESET);
            player.get(order).decreaseMoney(100);
        } else if (randomCommunityChestCard == 2) {
            System.out.println(ANSI_PURPLE + "------------------------------------------");
            System.out.println("| Take 100M for annual interest payment. |");
            System.out.println("------------------------------------------" + ANSI_RESET);
            player.get(order).increaseMoney(100);
        } else if (randomCommunityChestCard == 3) {
            System.out.println(ANSI_PURPLE + "-----------------------------");
            System.out.println("| Pay 50M for doctor's fee. |");
            System.out.println("-----------------------------" + ANSI_RESET);
            player.get(order).decreaseMoney(50);
        } else if (randomCommunityChestCard == 4) {
            System.out.println(ANSI_PURPLE + "----------------------------");
            System.out.println("| Pay 50M for tuition fee. |");
            System.out.println("----------------------------" + ANSI_RESET);
            player.get(order).decreaseMoney(50);
        } else if (randomCommunityChestCard == 5) {
            System.out.println(ANSI_PURPLE + "-------------------------------------");
            System.out.println("| Error in bank account! Take 200M. |");
            System.out.println("-------------------------------------" + ANSI_RESET);
            player.get(order).increaseMoney(200);
        } else if (randomCommunityChestCard == 6) {
            System.out.println(ANSI_PURPLE + "------------------------------------------------");
            System.out.println("| Your payment came from insurance! Take 100M. |");
            System.out.println("------------------------------------------------" + ANSI_RESET);
            player.get(order).increaseMoney(100);
        } else if (randomCommunityChestCard == 7) {
            System.out.println(ANSI_PURPLE + "---------------------");
            System.out.println("| You inherit 100M. |");
            System.out.println("---------------------" + ANSI_RESET);
            player.get(order).increaseMoney(100);
        } else if (randomCommunityChestCard == 8) {
            System.out.println(ANSI_PURPLE + "-------------------------------------------------------------");
            System.out.println("|You have won second prize in a beauty contest collect 10M. |");
            System.out.println("-------------------------------------------------------------" + ANSI_RESET);
            player.get(order).increaseMoney(10);
        } else if (randomCommunityChestCard == 9) {
            System.out.println(ANSI_PURPLE + "-----------------------------------");
            System.out.println("| You won 50M from sale of stock. |");
            System.out.println("-----------------------------------" + ANSI_RESET);
            player.get(order).increaseMoney(50);
        }
    }
}
