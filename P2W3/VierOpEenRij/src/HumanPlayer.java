import java.util.Scanner;

/**
 * Vincent Verboven
 * 7/12/2022
 */
public class HumanPlayer implements Player{
    private Color color;
    private Scanner Input = new Scanner(System.in);

    public HumanPlayer(Color color) {
        this.color = color;
    }

    @Override
    public void play(Board board) {
        System.out.print("What column? ");
        board.addPiece(new Piece(color),Input.nextInt());
    }
}
