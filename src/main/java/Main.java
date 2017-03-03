import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by MarcoBarragan on 3/3/17.
 */
public class Main {

    public static void main (String [] args){
        String[] board = new String[9];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TicTacToe ttt = new TicTacToe(System.out);
        Controller controller = new Controller(System.out, reader, ttt);
        controller.startGame();
    }
}
