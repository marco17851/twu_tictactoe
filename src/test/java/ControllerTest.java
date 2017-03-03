import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by MarcoBarragan on 3/3/17.
 */
public class ControllerTest {

    private PrintStream out;
    private BufferedReader in;
    private TicTacToe ttt;
    private Controller controller;

    @Before
    public void setUp() {
        out = mock(PrintStream.class);
        in = mock(BufferedReader.class);
        ttt = mock(TicTacToe.class);
        controller = new Controller(out, in, ttt);
    }
    
    @Test
    public void shouldTellBoardToPrintItselfWhenStartingGame() {
        controller.startGame();

        verify(ttt).printBoard();
    }

    @Test
    public void shouldGetPlayerMoveChoice() throws IOException {
        when(in.readLine()).thenReturn("1");
        String nextMove = controller.getPlayerMove();

        assertEquals("1", nextMove);
    }


}