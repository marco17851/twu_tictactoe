import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * Created by MarcoBarragan on 3/3/17.
 */
public class Controller {
    private final PrintStream out;
    private final BufferedReader in;
    private final TicTacToe ttt;


    public Controller(PrintStream out, BufferedReader in, TicTacToe ttt) {

        this.out = out;
        this.in = in;
        this.ttt = ttt;
    }

    public String getPlayerMove() throws IOException {
        return in.readLine();
    }

    public void startGame() {
        ttt.printBoard();
    }
}
