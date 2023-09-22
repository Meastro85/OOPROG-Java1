/**
 * Vincent Verboven
 * 27/10/2022
 */
public class Beeldscherm {
    char[][] beeld;
    int rijen;
    int kolommen;

    public Beeldscherm(){
        this.beeld = new char[25][80];
        this.rijen = 25;
        this.kolommen = 80;
    }

    public void maakLeeg(){
        for(int row = 0; row < rijen; row++ ){
            for(int col = 0; col < kolommen; col++){
                this.beeld[row][col] = " ".charAt(0);
            }
        }
    }

    public void print(){
        for ( char[] rij : this.beeld) {
            for (char kolom: rij) {
                System.out.print(kolom + " ");
            }
            System.out.println();
        }
    }

    public void zetKarakter(int x,int y,char c){
        this.beeld[y][x] = c;
    }
}
