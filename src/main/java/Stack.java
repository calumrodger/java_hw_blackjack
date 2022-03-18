import java.util.ArrayList;

public class Stack {

    private ArrayList<Card> cards;

    public Stack() {
        this.cards = new ArrayList<Card>();
    }


    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public int getStackSize() {
        return this.cards.size();
    }

    public void fillStack() {
        Card card1 = new Card(CardSuitType.HEARTS, CardValueType.ACE);
        Card card2 = new Card(CardSuitType.HEARTS, CardValueType.TWO);
        Card card3 = new Card(CardSuitType.HEARTS, CardValueType.THREE);
        Card card4 = new Card(CardSuitType.HEARTS, CardValueType.FOUR);
        Card card5 = new Card(CardSuitType.HEARTS, CardValueType.FIVE);
        Card card6 = new Card(CardSuitType.HEARTS, CardValueType.SIX);
        Card card7 = new Card(CardSuitType.HEARTS, CardValueType.SEVEN);
        Card card8 = new Card(CardSuitType.HEARTS, CardValueType.EIGHT);
        Card card9 = new Card(CardSuitType.HEARTS, CardValueType.NINE);
        Card card10 = new Card(CardSuitType.HEARTS, CardValueType.TEN);
        Card card11 = new Card(CardSuitType.HEARTS, CardValueType.JACK);
        Card card12 = new Card(CardSuitType.HEARTS, CardValueType.QUEEN);
        Card card13 = new Card(CardSuitType.HEARTS, CardValueType.KING);
        Card card14 = new Card(CardSuitType.DIAMONDS, CardValueType.ACE);
        Card card15 = new Card(CardSuitType.DIAMONDS, CardValueType.TWO);
        Card card16 = new Card(CardSuitType.DIAMONDS, CardValueType.THREE);
        Card card17 = new Card(CardSuitType.DIAMONDS, CardValueType.FOUR);
        Card card18 = new Card(CardSuitType.DIAMONDS, CardValueType.FIVE);
        Card card19 = new Card(CardSuitType.DIAMONDS, CardValueType.SIX);
        Card card20 = new Card(CardSuitType.DIAMONDS, CardValueType.SEVEN);
        Card card21 = new Card(CardSuitType.DIAMONDS, CardValueType.EIGHT);
        Card card22 = new Card(CardSuitType.DIAMONDS, CardValueType.NINE);
        Card card23 = new Card(CardSuitType.DIAMONDS, CardValueType.TEN);
        Card card24 = new Card(CardSuitType.DIAMONDS, CardValueType.JACK);
        Card card25 = new Card(CardSuitType.DIAMONDS, CardValueType.QUEEN);
        Card card26 = new Card(CardSuitType.DIAMONDS, CardValueType.KING);
        Card card27 = new Card(CardSuitType.CLUBS, CardValueType.ACE);
        Card card28 = new Card(CardSuitType.CLUBS, CardValueType.TWO);
        Card card29 = new Card(CardSuitType.CLUBS, CardValueType.THREE);
        Card card30 = new Card(CardSuitType.CLUBS, CardValueType.FOUR);
        Card card31 = new Card(CardSuitType.CLUBS, CardValueType.FIVE);
        Card card32 = new Card(CardSuitType.CLUBS, CardValueType.SIX);
        Card card33 = new Card(CardSuitType.CLUBS, CardValueType.SEVEN);
        Card card34 = new Card(CardSuitType.CLUBS, CardValueType.EIGHT);
        Card card35 = new Card(CardSuitType.CLUBS, CardValueType.NINE);
        Card card36 = new Card(CardSuitType.CLUBS, CardValueType.TEN);
        Card card37 = new Card(CardSuitType.CLUBS, CardValueType.JACK);
        Card card38 = new Card(CardSuitType.CLUBS, CardValueType.QUEEN);
        Card card39 = new Card(CardSuitType.CLUBS, CardValueType.KING);
        Card card40 = new Card(CardSuitType.SPADES, CardValueType.ACE);
        Card card41 = new Card(CardSuitType.SPADES, CardValueType.TWO);
        Card card42 = new Card(CardSuitType.SPADES, CardValueType.THREE);
        Card card43 = new Card(CardSuitType.SPADES, CardValueType.FOUR);
        Card card44 = new Card(CardSuitType.SPADES, CardValueType.FIVE);
        Card card45 = new Card(CardSuitType.SPADES, CardValueType.SIX);
        Card card46 = new Card(CardSuitType.SPADES, CardValueType.SEVEN);
        Card card47 = new Card(CardSuitType.SPADES, CardValueType.EIGHT);
        Card card48 = new Card(CardSuitType.SPADES, CardValueType.NINE);
        Card card49 = new Card(CardSuitType.SPADES, CardValueType.TEN);
        Card card50 = new Card(CardSuitType.SPADES, CardValueType.JACK);
        Card card51 = new Card(CardSuitType.SPADES, CardValueType.QUEEN);
        Card card52 = new Card(CardSuitType.SPADES, CardValueType.KING);
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        cards.add(card8);
        cards.add(card9);
        cards.add(card10);
        cards.add(card11);
        cards.add(card12);
        cards.add(card13);
        cards.add(card14);
        cards.add(card15);
        cards.add(card16);
        cards.add(card17);
        cards.add(card18);
        cards.add(card19);
        cards.add(card20);
        cards.add(card21);
        cards.add(card22);
        cards.add(card23);
        cards.add(card24);
        cards.add(card25);
        cards.add(card26);
        cards.add(card27);
        cards.add(card28);
        cards.add(card29);
        cards.add(card30);
        cards.add(card31);
        cards.add(card32);
        cards.add(card33);
        cards.add(card34);
        cards.add(card35);
        cards.add(card36);
        cards.add(card37);
        cards.add(card38);
        cards.add(card39);
        cards.add(card40);
        cards.add(card41);
        cards.add(card42);
        cards.add(card43);
        cards.add(card44);
        cards.add(card45);
        cards.add(card46);
        cards.add(card47);
        cards.add(card48);
        cards.add(card49);
        cards.add(card50);
        cards.add(card51);
        cards.add(card52);
    }
}
