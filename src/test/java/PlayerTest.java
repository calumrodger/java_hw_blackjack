import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

    Stack stack;
    Player player;

    @Before
    public void setUp() {
        stack = new Stack();
        player = new Player(null, null);
    }

    @Test
    public void canGetStack() {
        stack.fillStack();
        assertEquals(52, stack.getStackSize());
    }

    @Test
    public void canAddFirstCardToPlayerHand() {
        stack.fillStack();
        player.setFirstCard(stack.getCardFromStack());
        assertTrue(player.getFirstCard() instanceof Card);
    }

    @Test
    public void canAddSecondCardToPlayerHand() {
        stack.fillStack();
        player.setSecondCard(stack.getCardFromStack());
        assertTrue(player.getSecondCard() instanceof Card);
    }

    @Test
    public void canGetTotalPlayerHandValue() {
        stack.fillStack();
        player.setFirstCard(stack.getCardFromStack());
        player.setSecondCard(stack.getCardFromStack());
        Card card1 = player.getFirstCard();
        Card card2 = player.getSecondCard();
        assertEquals((card1.getValue() + card2.getValue()), player.getHandValue());

    }


    }
