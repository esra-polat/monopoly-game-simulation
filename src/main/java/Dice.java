import java.util.Random;

public class Dice {

    private Random randomDice = new Random();

    public int rollDice() {
        return randomDice.nextInt(6) + 1;
    }
}
