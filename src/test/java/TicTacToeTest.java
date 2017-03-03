import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


/**
 * Created by MarcoBarragan on 3/3/17.
 */
public class TicTacToeTest {

    private PrintStream out;
    private TicTacToe ttt;

    @Before
    public void setUp() {
        out = mock(PrintStream.class);
        ttt = new TicTacToe(out);
    }
    
    @Test
    public void shouldDrawTheBoardOnStart() {
        ttt.printBoard();

        verify(out).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldRedrawTheBoardAfterEveryMove() {
        ttt.placeMove("X", 1);
        ttt.printBoard();
        verify(out).println("X|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

}
