package Labyrint;

/**
 * Vincent Verboven
 * 17/10/2022
 */
public class Speler {
    private int aantalLevens;
    private String naam;
    private int x;
    private int y;
    final int MAXBREEDTE = 20;
    final int MAXHOOGTE = 20;

    public Speler(){
        this("Onbekend");
    }

    public Speler(String naam){
        this.aantalLevens = 3;
        this.naam = naam;
        this.x = MAXBREEDTE / 2;
        this.y = MAXHOOGTE / 2;
    }

    public void setNaam (String naam){
        if(!naam.isEmpty()) {
            this.naam = naam;
        } else {
            System.out.println("Naam mag niet leeg zijn.");
        }
    }

    public void setPos (int x, int y){
        if( this.MAXBREEDTE > this.x && this.x > 0 ) this.x = x;
        if( this.MAXHOOGTE > this.y && this.y > 0 ) this.y = y;
    }

    public String getNaam(){
        return this.naam;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getLevens(){
        return this.aantalLevens;
    }

    public void verplaats(int stapX, int stapY){
        setPos(this.x + stapX, this.y + stapY);
    }

    public void verplaats(){
        setPos(this.x + 1, this.y + 1);
    }

}