/**
 * Vincent Verboven
 * 7/12/2022
 */
public class FourInARow {
    private Player player1;
    private Player player2;
    private Board board;

    public FourInARow(){
        player1 = new HumanPlayer(Color.RED);
        player2 = new AIPlayer(Color.BLUE);
        board = new Board();
    }

    public void playGame(){
        System.out.println(board);
        do{
            player1.play(board);
            player2.play(board);
            System.out.println(board);
        }while(!board.isFull());
    }
}
