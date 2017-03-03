import java.io.PrintStream;

/**
 * Created by MarcoBarragan on 3/3/17.
 */
public class TicTacToe {

    private PrintStream out;
    private String [] board;

    public TicTacToe(PrintStream out) {
        this.out = out;
        setEmptyBoard();
    }

    private void setEmptyBoard(){
        board = new String[9];
        for (int x = 1; x <= board.length; x++){
            board[x-1] = String.valueOf(x);
        }
    }

    public void printBoard() {
        String printedBoard = "";
        for (int x = 0; x < board.length; x++){
            printedBoard += board[x];
            if ((x+1) % 3 != 0){
                printedBoard += "|";
            } else {
                if (x < 6) {
                    printedBoard += "\n-----\n";
                }
            }
        }

        out.println(printedBoard);
    }


    public void placeMove(String player, int location) {
        board[location-1] = player;
    }
}
