import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class InJailSquareTest {
    @Test
    public void ifMoneyOfPlayerIsGreaterThan50ThenMoneyShouldDecreaseUntilAmount(){
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(1,"TestUser",0,500,false));
        InJailSquare inJailSquare = new InJailSquare(Type.IN_JAIL, "In Jail Square", 20, 50, "You have to enter in jail!");
        inJailSquare.doTask(players,0,40,3);
        assertEquals(450,players.get(0).getMoney());
    }
}
