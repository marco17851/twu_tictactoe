import java.io.PrintStream;

/**
 * Created by MarcoBarragan on 3/3/17.
 */
public class TicTacToe {

    private PrintStream out;

    public TicTacToe(PrintStream out) {

        this.out = out;
    }


    public void printBoard() {
        out.println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }


}
