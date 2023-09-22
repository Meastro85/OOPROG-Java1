import java.util.Arrays;

/**
 * Vincent Verboven
 * 30/11/2022
 */
public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private Piece[][] pieces;
    private int pieceCounter;

    public Board(){
        pieces = new Piece[HEIGHT][WIDTH];
        pieceCounter = 0;
    }

    public void addPiece(Piece piece, int kolom){
        if(kolom >= 0 && kolom < 8) {
            for (int i = 0; i < HEIGHT; i++) {
                if (pieces[i][kolom] != null) {
                    if (i - 1 >= 0) {
                        pieces[i-1][kolom] = piece;
                    }
                } else if (i == HEIGHT - 1) {
                    pieces[i][kolom] = piece;
                }
            }
        }
    }

    public boolean isFull(){
        int maxPieces = WIDTH * HEIGHT;
        pieceCounter = 0;
        for (Piece[] piece : pieces) {
            for (Piece piece1 : piece) {
                if(piece1 != null) {
                    pieceCounter++;
                }
            }
        }
        return pieceCounter >= maxPieces;
    }

    public void printPieces(){
        for (Piece[] piece : pieces) {
            for (Piece piece1 : piece) {
                System.out.print(piece1);
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        StringBuilder bord = new StringBuilder();
        bord.append(" 0 1 2 3 4 5 6 7 \n");
        for(int i = 0; i < HEIGHT*2; i++){
            for(int j = 0; j < WIDTH; j++){
                if(i % 2 == 0){
                    bord.append("--");
                 }
                if(pieces[i/2][j] != null && i % 2 != 0){
                    bord.append("|").append(pieces[i/2][j].getColor());
                } else if(i % 2 != 0) {
                    bord.append("| ");
                }
                if(j == WIDTH - 1 && i % 2 == 0){
                    bord.append("-\n");
                } else if(j == WIDTH - 1){
                    bord.append("|\n");
                }
            }
            if(i == HEIGHT*2 - 1) {
                bord.append("-".repeat(WIDTH*2 + 1));
            }
        }
        return bord.toString();
    }
}
