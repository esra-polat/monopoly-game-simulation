import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class IncomeTaxSquareTest {
    @Test
    public void whenSquareTypeIsIncomeTaxSquareThenMoneyOfUserShouldDecreaseUntilAmount(){
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(1,"TestUser",0,500,false));
        IncomeTaxSquare incomeTaxSquare = new IncomeTaxSquare(Type.INCOME_TAX, "Income Tax Square", 35, 150, "You have to pay 150M tax on this square!");
        incomeTaxSquare.doTask(players,0,40,3);
        assertEquals(350,players.get(0).getMoney());
    }
}
