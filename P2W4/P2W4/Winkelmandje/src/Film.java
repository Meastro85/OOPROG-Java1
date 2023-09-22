import java.util.ArrayList;
import java.util.List;

/**
 * Vincent Verboven
 * 5/12/2022
 */
public class Film extends Artikel{
    private String titel;
    private List<String> acteurs;

    public Film(String id, double prijs, String titel, String acteurs) {
        super(id, prijs);
        this.acteurs = new ArrayList<>();
        this.titel = titel;
        this.acteurs.add(acteurs);
    }

    public String getTitel() {
        return titel;
    }

    public List<String> getActeurs() {
        return acteurs;
    }

    public void voegActeurToe(String acteur){
        acteurs.add(acteur);
    }

    @Override
    public String toString() {
        return String.format("%-6s %-75s",getId(),"\"" + titel + "\" " + acteurs);
    }
}
