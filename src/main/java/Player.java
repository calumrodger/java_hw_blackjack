import java.util.ArrayList;
import java.util.Random;

public class Player {

    private Card firstCard;
    private Card secondCard;
    private ArrayList<Card> playerCards;
    private boolean bust;
    private boolean stuck;

    public Player(Card firstCard, Card secondCard, boolean bust, boolean stuck) {
        this.firstCard = firstCard;
        this.secondCard = secondCard;
        this.playerCards = new ArrayList<>();
        this.bust = bust;
        this.stuck = stuck;
    }

    public ArrayList<Card> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(ArrayList<Card> playerCards) {
        this.playerCards = playerCards;
    }

    public boolean isStuck() {
        return stuck;
    }

    public void setStuck(boolean stuck) {
        this.stuck = stuck;
    }

    public void setStuckTrue(){
        this.stuck = true;
    }

    public boolean isBust() {
        return bust;
    }

    public void setBust(boolean bust) {
        this.bust = bust;
    }

    public void dealFirstCard(Card card) {
        this.playerCards.add(card);
    }

    public void dealSecondCard(Card card) {
        this.playerCards.add(card);
    }

    public void twist(Card card) {
        if (this.bust == false && this.stuck == false) {
            this.playerCards.add(card);
        }
        if (this.getPlayerCardsTotal() > 21) {
                this.bust = true;
        }
    }

    public Card getFirstCard() {
        return firstCard;
    }

    public void setFirstCard(Card firstCard) {
        this.firstCard = firstCard;
    }

    public Card getSecondCard() {
        return secondCard;
    }

    public void setSecondCard(Card secondCard) {
        this.secondCard = secondCard;
    }


    public int getHandValue() {
        int card1Value = firstCard.getValue();
        int card2Value = secondCard.getValue();
        int handValue = (card1Value + card2Value);
        return handValue;
    }

    public int getValueOfOneCardFromPlayerCards(int i) {
        return this.playerCards.get(i).getValue();
    }

    public int getPlayerCardsTotal() {
        int total = 0;
        for (int i = 0; i < this.playerCards.size(); i++) {
            total += (this.playerCards.get(i).getValue());
        }
        return total;
    }
}
