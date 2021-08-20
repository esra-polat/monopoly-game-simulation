import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CommunityChestCardSquareTest {
    @Test
    public void whenSquareTypeIsCommunityChestCardThenMoneyOfUserShouldChance(){
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(1,"TestUser",5,500,false));
        CommunityChestCardSquare communityChestCardSquare = new CommunityChestCardSquare(Type.COMMUNITY_CHEST_CARD,"Community Chest Card",5);
        communityChestCardSquare.doTask(players,0,40, 3);
        assertNotEquals(500, players.get(0).getMoney());
    }
}
