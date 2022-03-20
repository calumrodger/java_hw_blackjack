import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Stack stack;
    Player player;

    @Before
    public void setUp() {
        stack = new Stack();
        player = new Player(null, null, false, false);
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

    @Test
    public void canTwist() {
        stack.fillStack();
        player.twist(stack.getCardFromStack());
        assertEquals(1, player.getPlayerCards().size());
    }

    @Test
    public void canCheckIfBust() {
        stack.fillStack();
        player.dealFirstCard(stack.getCardFromStack());
        player.dealSecondCard(stack.getCardFromStack());
        player.twist(stack.getCardFromStack());
        player.twist(stack.getCardFromStack());
        player.twist(stack.getCardFromStack());
        player.twist(stack.getCardFromStack());
        player.twist(stack.getCardFromStack());
        player.twist(stack.getCardFromStack());
        player.twist(stack.getCardFromStack());
        assertNotEquals(9, player.getPlayerCardsTotal());
        assertEquals(true, player.isBust());
    }

    @Test
    public void canGetPlayerCardsTotal() {
        stack.fillStack();
        player.twist(stack.getCardFromStack());
        player.twist(stack.getCardFromStack());
        assertEquals(2, player.getPlayerCards().size());
        assertEquals((player.getValueOfOneCardFromPlayerCards(0)+ player.getValueOfOneCardFromPlayerCards(1)), player.getPlayerCardsTotal());
    }


    }
