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
}
