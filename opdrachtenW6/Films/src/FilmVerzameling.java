/**
 * Vincent Verboven
 * 24/10/2022
 */
public class FilmVerzameling {
    private Film[] films;
    int index = 0;

    public FilmVerzameling(int capaciteit){
        films = new Film[capaciteit];
    }

    public void voegFilmToe(Film film){
        if(index < films.length){
            films[index] = film;
            index++;
        }
    }

    public void toonOverzicht(){
        for(int i = 0; i < index; i++){
            System.out.printf("\n%2d." + films[i], i +1);
        }
    }
}
