import java.util.ArrayList;

public class Dealer {

    private Card firstCard;
    private Card secondCard;
    private ArrayList<Card> dealerCards;
    private boolean bust;
    private boolean stuck;

    public Dealer(Card firstCard, Card secondCard, boolean bust, boolean stuck) {
        this.firstCard = firstCard;
        this.secondCard = secondCard;
        this.dealerCards = new ArrayList<>();
        this.bust = bust;
        this.stuck = stuck;

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

    public ArrayList<Card> getDealerCards() {
        return dealerCards;
    }

    public void setDealerCards(ArrayList<Card> dealerCards) {
        this.dealerCards = dealerCards;
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

    public void setBustTrue(){
        this.bust = true;
    }

    public boolean isBust() {
        return bust;
    }

    public void setBust(boolean bust) {
        this.bust = bust;
    }

    public void dealFirstCard(Card card) {
        this.dealerCards.add(card);
    }

    public void dealSecondCard(Card card) {
        this.dealerCards.add(card);
    }

    public void twist(Card card) {
        if (this.getDealerCardsTotal() < 16) {
            this.dealerCards.add(card);
        }
        if (this.getDealerCardsTotal() > 21) {
            bust = true;
        }
        else {
            this.stuck = true;
        }
    }

    public int getDealerCardsTotal() {
        int total = 0;
        for (int i = 0; i < this.dealerCards.size(); i++) {
            total += (this.dealerCards.get(i).getValue());
        }
        return total;
    }

    public int getValueOfOneCardFromDealerCards(int i) {
        return this.dealerCards.get(i).getValue();
    }


    public int getHandValue() {
        int card1Value = firstCard.getValue();
        int card2Value = secondCard.getValue();
        int handValue = (card1Value + card2Value);
        return handValue;
    }
}
