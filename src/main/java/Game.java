import java.sql.Array;
import java.util.ArrayList;

public class Game {

    private ArrayList<Card> playerCards;
    private ArrayList<Card> dealerCards;

    public Game(ArrayList<Card> playerCards, ArrayList<Card> dealerCards) {
        this.playerCards = new ArrayList<Card>();
        this.dealerCards = new ArrayList<Card>();

    }

    public void turnPlayerCard(Card card) {
        this.playerCards.add(card);
    }

    public void turnDealerCard(Card card){
        this.dealerCards.add(card);
    }


}
