import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {

    Game game;
    Stack stack;
    Player player;
    Dealer dealer;

    @Before
    public void setUp() {
        game = new Game(null, null);
        stack = new Stack();
        player = new Player(null, null, false);
        dealer = new Dealer(null, null, false);
    }

    @Test
    public void canPlayRound() {
        stack.fillStack();
        player.setFirstCard(stack.getCardFromStack());
        player.setSecondCard(stack.getCardFromStack());
        int playerHand = player.getHandValue();
        dealer.setFirstCard(stack.getCardFromStack());
        dealer.setSecondCard(stack.getCardFromStack());
        int dealerHand = dealer.getHandValue();
        if (playerHand > dealerHand) {
            assertEquals("Player wins!", game.findWinner(playerHand, dealerHand));
        } else {
            assertEquals("Dealer wins!", game.findWinner(playerHand, dealerHand));
        }
    }


    }
