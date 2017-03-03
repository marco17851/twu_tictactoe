import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


/**
 * Created by MarcoBarragan on 3/3/17.
 */
public class TicTacToeTest {
    
    @Test
    public void shouldDrawTheBoardOnStart() {
        PrintStream out = mock(PrintStream.class);
        TicTacToe ttt = new TicTacToe(out);

        ttt.printBoard();

        verify(out).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

//    @Test
//    public void shouldRedrawTheBoardAfterEveryMove() {
//        PrintStream out = mock(PrintStream.class);
//        TicTacToe ttt = new TicTacToe(out);
//
//        ttt.startGame();
//
//
//    }

}
