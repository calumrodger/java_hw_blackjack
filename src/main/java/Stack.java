import java.util.ArrayList;
import java.util.Random;

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
        Card card1 = new Card(CardSuitType.HEARTS, CardValueType.ACE, 1);
        Card card2 = new Card(CardSuitType.HEARTS, CardValueType.TWO, 2);
        Card card3 = new Card(CardSuitType.HEARTS, CardValueType.THREE, 3);
        Card card4 = new Card(CardSuitType.HEARTS, CardValueType.FOUR, 4);
        Card card5 = new Card(CardSuitType.HEARTS, CardValueType.FIVE, 5);
        Card card6 = new Card(CardSuitType.HEARTS, CardValueType.SIX, 6);
        Card card7 = new Card(CardSuitType.HEARTS, CardValueType.SEVEN, 7);
        Card card8 = new Card(CardSuitType.HEARTS, CardValueType.EIGHT, 8);
        Card card9 = new Card(CardSuitType.HEARTS, CardValueType.NINE, 9);
        Card card10 = new Card(CardSuitType.HEARTS, CardValueType.TEN, 10);
        Card card11 = new Card(CardSuitType.HEARTS, CardValueType.JACK, 10);
        Card card12 = new Card(CardSuitType.HEARTS, CardValueType.QUEEN, 10);
        Card card13 = new Card(CardSuitType.HEARTS, CardValueType.KING, 10);
        Card card14 = new Card(CardSuitType.DIAMONDS, CardValueType.ACE, 1);
        Card card15 = new Card(CardSuitType.DIAMONDS, CardValueType.TWO, 2);
        Card card16 = new Card(CardSuitType.DIAMONDS, CardValueType.THREE, 3);
        Card card17 = new Card(CardSuitType.DIAMONDS, CardValueType.FOUR, 4);
        Card card18 = new Card(CardSuitType.DIAMONDS, CardValueType.FIVE, 5);
        Card card19 = new Card(CardSuitType.DIAMONDS, CardValueType.SIX, 6);
        Card card20 = new Card(CardSuitType.DIAMONDS, CardValueType.SEVEN, 7);
        Card card21 = new Card(CardSuitType.DIAMONDS, CardValueType.EIGHT, 8);
        Card card22 = new Card(CardSuitType.DIAMONDS, CardValueType.NINE, 9);
        Card card23 = new Card(CardSuitType.DIAMONDS, CardValueType.TEN, 10);
        Card card24 = new Card(CardSuitType.DIAMONDS, CardValueType.JACK, 10);
        Card card25 = new Card(CardSuitType.DIAMONDS, CardValueType.QUEEN, 10);
        Card card26 = new Card(CardSuitType.DIAMONDS, CardValueType.KING, 10);
        Card card27 = new Card(CardSuitType.CLUBS, CardValueType.ACE, 1);
        Card card28 = new Card(CardSuitType.CLUBS, CardValueType.TWO, 2);
        Card card29 = new Card(CardSuitType.CLUBS, CardValueType.THREE, 3);
        Card card30 = new Card(CardSuitType.CLUBS, CardValueType.FOUR, 4);
        Card card31 = new Card(CardSuitType.CLUBS, CardValueType.FIVE, 5);
        Card card32 = new Card(CardSuitType.CLUBS, CardValueType.SIX, 6);
        Card card33 = new Card(CardSuitType.CLUBS, CardValueType.SEVEN, 7);
        Card card34 = new Card(CardSuitType.CLUBS, CardValueType.EIGHT, 8);
        Card card35 = new Card(CardSuitType.CLUBS, CardValueType.NINE, 9);
        Card card36 = new Card(CardSuitType.CLUBS, CardValueType.TEN, 10);
        Card card37 = new Card(CardSuitType.CLUBS, CardValueType.JACK, 10);
        Card card38 = new Card(CardSuitType.CLUBS, CardValueType.QUEEN, 10);
        Card card39 = new Card(CardSuitType.CLUBS, CardValueType.KING, 10);
        Card card40 = new Card(CardSuitType.SPADES, CardValueType.ACE, 1);
        Card card41 = new Card(CardSuitType.SPADES, CardValueType.TWO, 2);
        Card card42 = new Card(CardSuitType.SPADES, CardValueType.THREE, 3);
        Card card43 = new Card(CardSuitType.SPADES, CardValueType.FOUR, 4);
        Card card44 = new Card(CardSuitType.SPADES, CardValueType.FIVE, 5);
        Card card45 = new Card(CardSuitType.SPADES, CardValueType.SIX, 6);
        Card card46 = new Card(CardSuitType.SPADES, CardValueType.SEVEN, 7);
        Card card47 = new Card(CardSuitType.SPADES, CardValueType.EIGHT, 8);
        Card card48 = new Card(CardSuitType.SPADES, CardValueType.NINE, 9);
        Card card49 = new Card(CardSuitType.SPADES, CardValueType.TEN, 10);
        Card card50 = new Card(CardSuitType.SPADES, CardValueType.JACK, 10);
        Card card51 = new Card(CardSuitType.SPADES, CardValueType.QUEEN, 10);
        Card card52 = new Card(CardSuitType.SPADES, CardValueType.KING, 10);
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

    public Card getCardFromStack() {
        this.fillStack();
        Random random_method = new Random();
        for (int i = 0; i < this.cards.size(); i++);{
            int index = random_method.nextInt(this.cards.size());
            this.cards.remove(index);
            return this.cards.get(index);
        }

    }
}
