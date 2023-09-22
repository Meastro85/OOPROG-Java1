import java.util.ArrayList;
import java.util.List;

/**
 * Vincent Verboven
 * 5/12/2022
 */
public class Boek extends Artikel{
    private String titel;
    private List<String> auteurs;

    public Boek(String id, double prijs,String titel, String auteurs) {
        super(id,prijs);
        this.auteurs = new ArrayList<>();
        this.titel = titel;
        this.auteurs.add(auteurs);
    }

    public String getTitel() {
        return titel;
    }

    public List<String> getAuteurs() {
        return auteurs;
    }

    public void voegAuteurToe(String auteur){
        auteurs.add(auteur);
    }

    @Override
    public String toString() {
        return String.format("%-6s %-75s", getId(), "\"" + titel + "\" " + auteurs);
    }
}
