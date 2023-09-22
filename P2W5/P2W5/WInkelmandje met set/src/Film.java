import java.util.ArrayList;
import java.util.List;

/**
 * Vincent Verboven
 * 5/12/2022
 */
public class Film extends Artikel{

    private List<String> acteurs;

    public Film(String id, double prijs, String titel, String acteurs) {
        super(id, prijs, titel);
        this.acteurs = new ArrayList<>();
        this.acteurs.add(acteurs);
    }

    public List<String> getActeurs() {
        return acteurs;
    }

    public void voegActeurToe(String acteur){
        acteurs.add(acteur);
    }

    @Override
    public String toString() {
        return String.format("%-6s %-75s",getId(),"\"" + getTitel() + "\" " + acteurs);
    }
}
