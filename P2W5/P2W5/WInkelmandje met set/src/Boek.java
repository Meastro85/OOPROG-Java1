import java.util.ArrayList;
import java.util.List;

/**
 * Vincent Verboven
 * 5/12/2022
 */
public class Boek extends Artikel{
    private List<String> auteurs;

    public Boek(String id, double prijs,String titel, String auteurs) {
        super(id,prijs,titel);
        this.auteurs = new ArrayList<>();
        this.auteurs.add(auteurs);
    }


    public List<String> getAuteurs() {
        return auteurs;
    }

    public void voegAuteurToe(String auteur){
        auteurs.add(auteur);
    }

    @Override
    public String toString() {
        return String.format("%-6s %-75s", getId(), "\"" + getTitel() + "\" " + auteurs);
    }
}
