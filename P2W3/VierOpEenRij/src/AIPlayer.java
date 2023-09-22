import java.util.Random;

/**
 * Vincent Verboven
 * 7/12/2022
 */
public class AIPlayer implements Player{
    private Color color;
    private Random gen;

    public AIPlayer(Color color){
        this.color = color;
        this.gen = new Random();
    }

    @Override
    public void play(Board board) {
        board.addPiece(new Piece(color), gen.nextInt(0,8));
    }
}
