import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ElectricTaxSquareTest {
    @Test
    public void whenSquareTypeIsElectricTaxSquareThenMoneyOfUserShouldDecreaseUntilAmount(){
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(1,"TestUser",0,500,false));
        ElectricTaxSquare electricTaxSquare = new ElectricTaxSquare(Type.ELECTRIC_TAX, "Electric Tax Square", 35, 150, "You have to pay 150M electric tax on this square!");
        electricTaxSquare.doTask(players,0,40,3);
        assertEquals(350,players.get(0).getMoney());
    }
}
