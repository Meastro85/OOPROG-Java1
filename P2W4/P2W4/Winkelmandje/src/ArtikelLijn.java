/**
 * Vincent Verboven
 * 5/12/2022
 */
public class ArtikelLijn {
    private Artikel artikel;
    private int aantal;

    public ArtikelLijn(Artikel artikel, int aantal) {
        this.artikel = artikel;
        this.aantal = aantal;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public int getAantal() {
        return aantal;
    }

    public double getPrijs() {
        return artikel.getPrijs()*aantal;
    }

    @Override
    public String toString() {
        return String.format("%s %6d %6.2f",artikel,aantal,getPrijs());
    }
}
