import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DealerTest {

    Stack stack;
    Dealer dealer;

    @Before
    public void setUp() {
        stack = new Stack();
        dealer = new Dealer(null, null, false, false);
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


    @Test
    public void canTwist() {
        stack.fillStack();
        dealer.twist(stack.getCardFromStack());
        assertEquals(1, dealer.getDealerCards().size());
    }

    @Test
    public void canCheckIfBust() {
        stack.fillStack();
        dealer.dealFirstCard(stack.getCardFromStack());
        dealer.dealSecondCard(stack.getCardFromStack());
        dealer.twist(stack.getCardFromStack());
        dealer.twist(stack.getCardFromStack());
        dealer.twist(stack.getCardFromStack());
        dealer.twist(stack.getCardFromStack());
        dealer.twist(stack.getCardFromStack());
        dealer.twist(stack.getCardFromStack());
        dealer.twist(stack.getCardFromStack());
        assertNotEquals(9, dealer.getDealerCardsTotal());
        assertEquals(true, dealer.isBust());
    }

    @Test
    public void canGetPlayerCardsTotal() {
        stack.fillStack();
        dealer.twist(stack.getCardFromStack());
        dealer.twist(stack.getCardFromStack());
        assertEquals(2, dealer.getDealerCards().size());
        assertEquals((dealer.getValueOfOneCardFromDealerCards(0)+ dealer.getValueOfOneCardFromDealerCards(1)), dealer.getDealerCardsTotal());
    }


}
