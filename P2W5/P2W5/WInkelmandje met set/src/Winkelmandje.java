import java.util.*;

/**
 * Vincent Verboven
 * 5/12/2022
 */
public class Winkelmandje {
    private Set<ArtikelLijn> artikelLijnen;

    public Winkelmandje(){
        artikelLijnen = new HashSet<>();
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

    public List<ArtikelLijn> artikelenVolgensId(){
        List<ArtikelLijn> volgensId = new ArrayList<>(artikelLijnen);
        volgensId.sort(Comparator.comparing(o -> o.getArtikel().getId()));
        return volgensId;
    }

    public List<ArtikelLijn> artikelenVolgensPrijs(){
        List<ArtikelLijn> volgensPrijs = new ArrayList<>(artikelLijnen);
        volgensPrijs.sort(Comparator.comparing(o -> o.getArtikel().getPrijs()));
        return volgensPrijs;
    }

    public List<ArtikelLijn> artikelenVolgensNaam(){
        List<ArtikelLijn> volgensNaam = new ArrayList<>(artikelLijnen);
        volgensNaam.sort(Comparator.comparing(o -> o.getArtikel().getTitel()));
        return volgensNaam;
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
