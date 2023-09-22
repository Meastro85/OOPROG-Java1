import static java.lang.String.format;

/**
 * Vincent Verboven
 * 24/10/2022
 */
public class Film {
    private String titel;
    private int jaar;

    public Film(String titel, int jaar){
        this.titel = titel;
        this.jaar = jaar;
    }

    public String getTitel(){
        return this.titel;
    }

    public int getJaar(){
        return this.jaar;
    }

    public String toString() {
        return format("%-26s %4d",this.titel,this.jaar);
    }
}
