package be.kdg.compi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoFilm {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("The Godfather", 1972));
        films.add(new Film("The Shawshank Redemption", 1994));
        films.add(new Film("Schindler's List", 1993));
        films.add(new Film("Raging Bull", 1980));
        films.add(new Film("Casablanca", 1942));
        films.add(new Film("Citizen Kane", 1941));
        films.add(new Film("Gone with the Wind", 1939));
        films.add(new Film("The Wizard of Oz", 1939));
        films.add(new Film("One Flew Over the Cuckoo's Nest", 1975));
        films.add(new Film("Lawrence of Arabia", 1962));
        films.add(new Film("Vertigo", 1958));
        films.add(new Film("Psycho", 1960));
        // ...
        Collections.sort(films);
        // ...
        films.forEach(System.out::println);

    }
}

/*
Gone with the Wind               1939
The Wizard of Oz                 1939
Citizen Kane                     1941
Casablanca                       1942
Vertigo                          1958
Psycho                           1960
Lawrence of Arabia               1962
The Godfather                    1972
One Flew Over the Cuckoo's Nest  1975
Raging Bull                      1980
Schindler's List                 1993
The Shawshank Redemption         1994
*/