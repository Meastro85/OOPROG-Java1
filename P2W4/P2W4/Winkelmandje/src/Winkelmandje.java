import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Vincent Verboven
 * 5/12/2022
 */
public class Winkelmandje {
    private List<ArtikelLijn> artikelLijnen;

    public Winkelmandje(){
        artikelLijnen = new LinkedList<>();
    }

    public void voegArtikelToe(Artikel artikel, int aantal){
        artikelLijnen.add(new ArtikelLijn(artikel, aantal));
    }

    public void verwijderArtikel(Artikel artikel){
        for(Iterator<ArtikelLijn> it = artikelLijnen.iterator(); it.hasNext();){
            if(it.next().getArtikel() == artikel){
                it.remove();
            }
        }
    }

    public double getPrijs(){
        double prijs = 0;
        for (ArtikelLijn artikelLijn : artikelLijnen) {
            prijs += artikelLijn.getPrijs() * artikelLijn.getAantal();
        }
        return prijs;
    }

    @Override
    public String toString() {
        StringBuilder winkelmand = new StringBuilder();
        winkelmand.append(String.format("%-6s %-75s %-6s %-5s \n","nummer","beschrijving","aantal","totaal"));
        for (ArtikelLijn artikelLijn : artikelLijnen) {
            winkelmand.append(artikelLijn).append("\n");
        }
        return winkelmand.toString();
    }
}
