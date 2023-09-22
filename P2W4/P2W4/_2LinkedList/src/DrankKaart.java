import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Vincent Verboven
 * 5/12/2022
 */
public class DrankKaart {
    private List<Drank> dranken = new LinkedList<>();

    public void voegDrankToe(Drank drank){
        dranken.add(drank);
    }

    public int getAantal(){
        return dranken.size();
    }

    public double getTotaleprijs(){
        double totalePrijs = 0;
        for(Iterator<Drank> it = dranken.iterator(); it.hasNext(); ){
            totalePrijs += it.next().getPrijs();
        }
        return totalePrijs;
    }

    public double duurste(){
        double duurste = 0;
        for (Drank drank : dranken) {
            if (drank.getPrijs()>duurste) duurste = drank.getPrijs();
        }
        return duurste;
    }

    public List<Drank> getAlcoholischeDranken(){
        List<Drank> alcoholischeDranken = new LinkedList<>();
        for (Drank drank : dranken) {
            if(drank.isAlcoholisch()) alcoholischeDranken.add(drank);
            }
        return alcoholischeDranken;
        }

    public void verwijderDuurderDan(double waarde){
        for(Iterator<Drank> it = dranken.iterator(); it.hasNext(); ){
            if(it.next().getPrijs() > waarde) it.remove();
        }
    }

    public void voegDrankenToe(Drank[] dranken){
        this.dranken.addAll(Arrays.asList(dranken));
    }

    @Override
    public String toString() {
        return String.format("Kaart: %s",dranken);
    }
}
