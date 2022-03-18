import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Card card5;
    Card card6;
    Card card7;
    Card card8;
    Card card9;
    Card card10;
    Card card11;
    Card card12;
    Card card13;
    Card card14;
    Card card15;
    Card card16;
    Card card17;
    Card card18;
    Card card19;
    Card card20;
    Card card21;
    Card card22;
    Card card23;
    Card card24;
    Card card25;
    Card card26;
    Card card27;
    Card card28;
    Card card29;
    Card card30;
    Card card31;
    Card card32;
    Card card33;
    Card card34;
    Card card35;
    Card card36;
    Card card37;
    Card card38;
    Card card39;
    Card card40;
    Card card41;
    Card card42;
    Card card43;
    Card card44;
    Card card45;
    Card card46;
    Card card47;
    Card card48;
    Card card49;
    Card card50;
    Card card51;
    Card card52;
    Stack stack;

    @Before
    public void setUp() {
        card1 = new Card(CardSuitType.HEARTS, CardValueType.ACE);
        card2 = new Card(CardSuitType.HEARTS, CardValueType.TWO);
        card3 = new Card(CardSuitType.HEARTS, CardValueType.THREE);
        card4 = new Card(CardSuitType.HEARTS, CardValueType.FOUR);
        card5 = new Card(CardSuitType.HEARTS, CardValueType.FIVE);
        card6 = new Card(CardSuitType.HEARTS, CardValueType.SIX);
        card7 = new Card(CardSuitType.HEARTS, CardValueType.SEVEN);
        card8 = new Card(CardSuitType.HEARTS, CardValueType.EIGHT);
        card9 = new Card(CardSuitType.HEARTS, CardValueType.NINE);
        card10 = new Card(CardSuitType.HEARTS, CardValueType.TEN);
        card11 = new Card(CardSuitType.HEARTS, CardValueType.JACK);
        card12 = new Card(CardSuitType.HEARTS, CardValueType.QUEEN);
        card13 = new Card(CardSuitType.HEARTS, CardValueType.KING);
        card14 = new Card(CardSuitType.DIAMONDS, CardValueType.ACE);
        card15 = new Card(CardSuitType.DIAMONDS, CardValueType.TWO);
        card16 = new Card(CardSuitType.DIAMONDS, CardValueType.THREE);
        card17 = new Card(CardSuitType.DIAMONDS, CardValueType.FOUR);
        card18 = new Card(CardSuitType.DIAMONDS, CardValueType.FIVE);
        card19 = new Card(CardSuitType.DIAMONDS, CardValueType.SIX);
        card20 = new Card(CardSuitType.DIAMONDS, CardValueType.SEVEN);
        card21 = new Card(CardSuitType.DIAMONDS, CardValueType.EIGHT);
        card22 = new Card(CardSuitType.DIAMONDS, CardValueType.NINE);
        card23 = new Card(CardSuitType.DIAMONDS, CardValueType.TEN);
        card24 = new Card(CardSuitType.DIAMONDS, CardValueType.JACK);
        card25 = new Card(CardSuitType.DIAMONDS, CardValueType.QUEEN);
        card26 = new Card(CardSuitType.DIAMONDS, CardValueType.KING);
        card27 = new Card(CardSuitType.CLUBS, CardValueType.ACE);
        card28 = new Card(CardSuitType.CLUBS, CardValueType.TWO);
        card29 = new Card(CardSuitType.CLUBS, CardValueType.THREE);
        card30 = new Card(CardSuitType.CLUBS, CardValueType.FOUR);
        card31 = new Card(CardSuitType.CLUBS, CardValueType.FIVE);
        card32 = new Card(CardSuitType.CLUBS, CardValueType.SIX);
        card33 = new Card(CardSuitType.CLUBS, CardValueType.SEVEN);
        card34 = new Card(CardSuitType.CLUBS, CardValueType.EIGHT);
        card35 = new Card(CardSuitType.CLUBS, CardValueType.NINE);
        card36 = new Card(CardSuitType.CLUBS, CardValueType.TEN);
        card37 = new Card(CardSuitType.CLUBS, CardValueType.JACK);
        card38 = new Card(CardSuitType.CLUBS, CardValueType.QUEEN);
        card39 = new Card(CardSuitType.CLUBS, CardValueType.KING);
        card40 = new Card(CardSuitType.SPADES, CardValueType.ACE);
        card41 = new Card(CardSuitType.SPADES, CardValueType.TWO);
        card42 = new Card(CardSuitType.SPADES, CardValueType.THREE);
        card43 = new Card(CardSuitType.SPADES, CardValueType.FOUR);
        card44 = new Card(CardSuitType.SPADES, CardValueType.FIVE);
        card45 = new Card(CardSuitType.SPADES, CardValueType.SIX);
        card46 = new Card(CardSuitType.SPADES, CardValueType.SEVEN);
        card47 = new Card(CardSuitType.SPADES, CardValueType.EIGHT);
        card48 = new Card(CardSuitType.SPADES, CardValueType.NINE);
        card49 = new Card(CardSuitType.SPADES, CardValueType.TEN);
        card50 = new Card(CardSuitType.SPADES, CardValueType.JACK);
        card51 = new Card(CardSuitType.SPADES, CardValueType.QUEEN);
        card52 = new Card(CardSuitType.SPADES, CardValueType.KING);
        stack = new Stack();
    }

    @Test
    public void canCheckStackSize() {
        assertEquals(0, stack.getStackSize());
    }

    @Test
    public void canFillStack(){
        stack.fillStack();
        assertEquals(52, stack.getStackSize());
    }
}
