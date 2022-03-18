public class Dealer {

    private int firstCard;
    private int secondCard;

    public Dealer(int firstCard, int secondCard) {
        this.firstCard = firstCard;
        this.secondCard = secondCard;
    }

    public int getFirstCard() {
        return firstCard;
    }

    public void setFirstCard(int firstCard) {
        this.firstCard = firstCard;
    }

    public int getSecondCard() {
        return secondCard;
    }

    public void setSecondCard(int secondCard) {
        this.secondCard = secondCard;
    }
}
