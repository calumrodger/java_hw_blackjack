import java.sql.Array;
import java.util.ArrayList;

public class Game {

    private Player player;
    private Dealer dealer;

    public Game(Player player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;

    }




    public String checkForBust() {
        String winner = "";
        if (dealer.isBust() == true) {
            winner = "Dealer bust. Player wins!";
        }
        if (player.isBust() == true) {
            winner = "Player bust. Dealer wins!";
        }
        return winner;
    }

    public String checkForStick() {
        String winner = "";
        if (player.isStuck() == true && dealer.isStuck() == true){
            if (player.getPlayerCardsTotal() > dealer.getDealerCardsTotal()){
                winner = "Player wins!";
            }
            if (player.getPlayerCardsTotal() < dealer.getDealerCardsTotal()){
                winner = "Dealer wins!";
            }
        }
        return winner;
    }
}
