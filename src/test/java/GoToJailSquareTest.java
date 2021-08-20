import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GoToJailSquareTest {
    @Test
    public void whenSquareTypeGoToJailThenIsInJailOfUserShouldBeTrue(){
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(1,"TestUser",13,500,false));
        GoToJailSquare goToJailSquare = new GoToJailSquare(Type.GO_TO_JAIL, "Go To Jail", 13);
        goToJailSquare.doTask(players,0,40,3);
        assertEquals(true, players.get(0).isInJail());
    }
}
