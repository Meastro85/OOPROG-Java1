import Bib.Boek;

/**
 * Vincent Verboven
 * 17/10/2022
 */
public class Bibliotheek {
    public static void main(String[] args) {
        Boek Java = new Boek("y. daniel", "Introduction to java programming", 1240 );
        Java.setOntleend(true);
        System.out.printf("Het boek %s (%d pagina's), geschreven door %s is momenteel %sontleend\n",
                Java.getTitel().toUpperCase(), Java.getPaginas(), Java.getAuteur().toUpperCase(), !Java.getOntleend() ? "niet " : "");

        Boek KBaan = new Boek("Louis Paal Boon","kapellekensbaan",291);
        System.out.printf("Het boek %s (%d pagina's), geschreven door %s is momenteel %sontleend\n",
                KBaan.getTitel().toUpperCase(), Java.getPaginas(), Java.getAuteur().toUpperCase(), !Java.getOntleend() ? "niet " : "");

        Boek Drugs = new Boek("Jef Geeraerts", "Drugs", 333);
        Drugs.setOntleend(true);
        System.out.printf("Het boek %s (%d pagina's), geschreven door %s is momenteel %sontleend\n",
                Drugs.getTitel().toUpperCase(), Drugs.getPaginas(), Drugs.getAuteur().toUpperCase(), !Drugs.getOntleend() ? "niet " : "");
    }
}
