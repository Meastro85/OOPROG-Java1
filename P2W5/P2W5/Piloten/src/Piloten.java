import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Vincent Verboven
 * 15/12/2022
 */
public class Piloten {
    Map<String,Piloot> piloten;
    Piloot[] kampioenen = {
            new Piloot("Duits", "Michael Schumacher", 7),
            new Piloot("Argentijns", "Juan Manuel Fangio", 5),
            new Piloot("Frans", "Alain Prost", 4),
            new Piloot("Duits", "Sebastian Vettel", 4),
            new Piloot("Australisch", "Jack Brabham", 3),
            new Piloot("Brits", "Jackie Stewart", 3),
            new Piloot("Oostenrijks", "Niki Lauda", 3),
            new Piloot("Braziliaans", "Nelson Piquet", 3),
            new Piloot("Braziliaans", "Ayrton Senna", 3)
    };

    int[][] seizoenen = {
            {1994, 1995, 2000, 2001, 2002, 2003, 2004},
            {1951, 1954, 1955, 1956, 1957},
            {1985, 1986, 1989, 1993},
            {2010, 2011, 2012, 2013},
            {1959, 1960, 1966},
            {1969, 1971, 1973},
            {1975, 1977, 1984},
            {1981, 1983, 1987},
            {1988, 1990, 1991}
    };

    public Piloten(){
        piloten = new TreeMap<>();
        for(int i = 0; i < kampioenen.length; i++){
            for (int j = 0; j < seizoenen[i].length;j++){
                kampioenen[i].voegSeizoenToe(seizoenen[i][j]);
            }
        }
        vulMap();
    }

    public void vulMap(){
        for (Piloot piloot : kampioenen) {
            piloten.put(piloot.getNaam(),piloot);
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Piloot piloot : piloten.values()) {
            string.append(piloot).append("\n");
        }
        return string.toString();
    }
}
