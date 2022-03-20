import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {

    Stack stack;

    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void canCheckStackSize() {
        assertEquals(0, stack.getStackSize());
    }

    @Test
    public void canFillStack(){
        stack.fillStack();
        assertEquals(52, stack.getStackSize());
    }

    @Test
    public void canGetCardFromStack(){
        assertTrue(stack.getCardFromStack() instanceof Card);

    }

    @Test
    public void getCardFromStackReducesStackSize(){
        stack.getCardFromStack();
        assertEquals(51, stack.getStackSize());
    }


}
