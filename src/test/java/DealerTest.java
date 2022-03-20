import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DealerTest {

    Stack stack;
    Dealer dealer;

    @Before
    public void setUp() {
        stack = new Stack();
        dealer = new Dealer(null, null, false);
    }

    @Test
    public void canGetStack() {
        stack.fillStack();
        assertEquals(52, stack.getStackSize());
    }

    @Test
    public void canAddFirstCardToDealerHand() {
        stack.fillStack();
        dealer.setFirstCard(stack.getCardFromStack());
        assertTrue(dealer.getFirstCard() instanceof Card);
    }

    @Test
    public void canAddSecondCardToDealerHand() {
        stack.fillStack();
        dealer.setSecondCard(stack.getCardFromStack());
        assertTrue(dealer.getSecondCard() instanceof Card);
    }

    @Test
    public void canGetTotalDealerHandValue() {
        stack.fillStack();
        dealer.setFirstCard(stack.getCardFromStack());
        dealer.setSecondCard(stack.getCardFromStack());
        Card card1 = dealer.getFirstCard();
        Card card2 = dealer.getSecondCard();
        assertEquals((card1.getValue() + card2.getValue()), dealer.getHandValue());

    }


}
