import java.util.Random;

public class Player {

    private Card firstCard;
    private Card secondCard;

    public Player(Card firstCard, Card secondCard) {
        this.firstCard = firstCard;
        this.secondCard = secondCard;
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
}
