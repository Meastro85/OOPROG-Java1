package be.kdg.compi;

public class Film implements Comparable<Film> {
    private String titel;
    private int jaar;

    public Film(String titel, int jaar) {
        this.titel = titel;
        this.jaar = jaar;
    }

    @Override
    public int compareTo(Film andereFilm) {
        // return jaar - andereFilm.jaar;
         return Integer.compare(jaar, andereFilm.jaar);
    }

    @Override
    public String toString() {
        return String.format("%-32s %4d", titel, jaar);
    }
}
