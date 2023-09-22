/**
 * Vincent Verboven
 * 26/10/2022
 */
public class TestVerzameling {
    public static void main(String[] args) {
        FilmVerzameling verzameling = new FilmVerzameling(10);

        verzameling.voegFilmToe(new Film("Batman", 1989));
        verzameling.voegFilmToe(new Film("When Harry Met Sally", 1989));
        verzameling.voegFilmToe(new Film("Dances With Wolves", 1990));
        verzameling.voegFilmToe(new Film("Pretty Woman", 1990));
        verzameling.voegFilmToe(new Film("Total Recal", 1990));
        verzameling.voegFilmToe(new Film("Thelma & Louise", 1991));
        verzameling.voegFilmToe(new Film("The Silence Of The Lambs", 1991));
        verzameling.voegFilmToe(new Film("Reservoir Dogs", 1992));
        verzameling.voegFilmToe(new Film("Jurassic Park", 1993));
        verzameling.voegFilmToe(new Film("Schindler's List", 1993));

        verzameling.toonOverzicht();
        int[] test = new int[3];
        System.out.println(test[0]);
    }
}
