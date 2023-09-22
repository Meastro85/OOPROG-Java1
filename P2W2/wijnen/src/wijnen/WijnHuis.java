package wijnen;

public class WijnHuis {
    private static final int MAX_AANTAL = 10;
    private Wijn[] wijnen = new Wijn[MAX_AANTAL];  //voorlopig gevuld met 10 null-objecten
    private String naam;
    private int aantal;

    public WijnHuis(String naam) {
        this.naam = naam;
        this.aantal = 0;
    }

    public void voegWijnToe(Wijn wijn) {
            if(!zoekWijn(wijn) && aantal < MAX_AANTAL) {
                wijnen[aantal++] = wijn;
        }
    }

    public boolean zoekWijn(Wijn wijn) {
            for (Wijn wijn1 : wijnen) {
                if(wijn1 != null) {
                    if (wijn1.getNaam().equals(wijn.getNaam())) {
                        return true;
                    }
                }
            }

        return false;
    }

    public Wijn getOudsteWijn() {
        if(!(aantal == 0)){
            Wijn oudsteWijn = wijnen[1];
            for (Wijn wijn: wijnen) {
                if(oudsteWijn.getOogstDatum().isAfter(wijn.getOogstDatum())){
                    oudsteWijn = wijn;
                }
            }
            return oudsteWijn;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Wijnhuis %s", naam.toUpperCase()));

        StringBuilder wijnenTekst = new StringBuilder();
        StringBuilder champagneTekst = new StringBuilder();
        StringBuilder likeurenTekst = new StringBuilder();
        for (Wijn wijn: wijnen) {
            if(wijn instanceof Champagne){
                champagneTekst.append("\n").append(wijn);
            } else if(wijn instanceof Likeur){
                likeurenTekst.append("\n").append(wijn);
            } else {
                wijnenTekst.append("\n").append(wijn);
            }
        }
        result.append("\nWijnen:").append(wijnenTekst);
        result.append("\nChampagnes:").append(champagneTekst);
        result.append("\nLikeuren:").append(likeurenTekst);
        return result.toString();
    }
}
