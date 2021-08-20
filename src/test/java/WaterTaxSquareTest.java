import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WaterTaxSquareTest {
    @Test
    public void whenSquareTypeIsWaterTaxSquareThenMoneyOfUserShouldDecreaseUntilAmount() {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(1, "TestUser", 0, 500, false));
        WaterTaxSquare waterTaxSquare = new WaterTaxSquare(Type.WATER_TAX, "Water Tax Square", 35, 150, "You have to pay 150M electric tax on this square!");
        waterTaxSquare.doTask(players, 0, 40,3);
        assertEquals(350, players.get(0).getMoney());
    }
}
