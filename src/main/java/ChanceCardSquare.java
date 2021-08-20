import java.util.ArrayList;

public class ChanceCardSquare extends Square {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static int bagdat;
    public static int beyoglu;
    public static int istiklal;
    public static int taksim;
    public static int railRoad;

    private String[] chanceCard = new String[]{
            "Go on 5 squares.", //0
            "Speeding Ticket! Pay 15 TL.", //1
            "Go To Jail!", //2
            "Move into Istiklal Avenue. If you pass the starting point, take 200 TL.", //3
            "Go back 3 squares.", //4
            "Move into Boardwalk and have fun!", //5
            "You rented out your house, take 150 TL.", //6
            "Move to the starting point and take 200 TL!", //7
            "Move into New York RailRoad. If you pass the starting point, take 200 TL.", //8
            "The bank pays profit share, 50 TL." //9
    };

    public ChanceCardSquare(Type type, String name, int position) {
        super(type, name, position);
    }

    @Override
    void doTask(ArrayList<Player> player, int order, int numberOfSquare, int jailPosition) {

        int randomChanceCard = random.nextInt(9) + 1;

        if (randomChanceCard == 0) {
            System.out.println(ANSI_YELLOW + "<<< Go on 5 squares >>>" + ANSI_RESET);
            player.get(order).setLocationOfPlayer(5, numberOfSquare);
        } else if (randomChanceCard == 1) {
            System.out.println(ANSI_YELLOW + "------------------------------");
            System.out.println("| Speeding Ticket! Pay 15 TL |");
            System.out.println("------------------------------" + ANSI_RESET);
            player.get(order).decreaseMoney(15);
        } else if (randomChanceCard == 2) {
            System.out.println(ANSI_YELLOW + "---------------");
            System.out.println("| Go To Jail! |");
            System.out.println("---------------" + ANSI_RESET);
            player.get(order).setIsInJail(true);
            player.get(order).goInJail(jailPosition);
        } else if (randomChanceCard == 3) {
            System.out.println(ANSI_YELLOW + "--------------------------------------------------------------------------");
            System.out.println("| Move into Istiklal Avenue. If you pass the starting point, take 50 TL |");
            System.out.println("--------------------------------------------------------------------------" + ANSI_RESET);
            player.get(order).setLocationOfPlayer(istiklal);
        } else if (randomChanceCard == 4) {
            System.out.println(ANSI_YELLOW + "---------------------");
            System.out.println("| Go back 3 squares |");
            System.out.println("---------------------" + ANSI_RESET);
            player.get(order).setLocationOfPlayer(-3, numberOfSquare);
        } else if (randomChanceCard == 5) {
            System.out.println(ANSI_YELLOW + "----------------------------------");
            System.out.println("| Move into Taksim and have fun! |");
            System.out.println("----------------------------------" + ANSI_RESET);
            player.get(order).setLocationOfPlayer(taksim);
        } else if (randomChanceCard == 6) {
            System.out.println(ANSI_YELLOW + "------------------------------------------");
            System.out.println("| You rented out your house, take 150 TL |");
            System.out.println("------------------------------------------" + ANSI_RESET);
            player.get(order).increaseMoney(150);
        } else if (randomChanceCard == 7) {
            System.out.println(ANSI_YELLOW + "-----------------------------------------------");
            System.out.println("| Move to the starting point and take 200 TL! |");
            System.out.println("-----------------------------------------------" + ANSI_RESET);
            player.get(order).setLocationOfPlayer(0);
            player.get(order).increaseMoney(200);
        } else if (randomChanceCard == 8) {
            System.out.println(ANSI_YELLOW + "-------------------------------------------------------------------");
            System.out.println("| Move into RailRoad. If you pass the starting point, take 50 TL |");
            System.out.println("-------------------------------------------------------------------" + ANSI_RESET);
            player.get(order).setLocationOfPlayer(railRoad);
        } else if (randomChanceCard == 9) {
            System.out.println(ANSI_YELLOW + "-------------------------------------");
            System.out.println("| The bank pays profit share, 50 TL |");
            System.out.println("-------------------------------------" + ANSI_RESET);
            player.get(order).increaseMoney(50);
        }
    }
}
