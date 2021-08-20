import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DiceTest {

    private Dice dice;

    @Before
    public void setUp() throws Exception {
        dice = new Dice();
    }

    @Test
    public void whenRolledDiceThenShouldReturnGreaterThanZero() {
        assertTrue(dice.rollDice() > 0);
    }

    @Test
    public void whenRolledDiceThenShouldReturnShorterThanSeven() {
        assertTrue(dice.rollDice() < 7);
    }
}
