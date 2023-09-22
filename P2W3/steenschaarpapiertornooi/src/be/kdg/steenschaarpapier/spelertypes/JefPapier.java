package be.kdg.steenschaarpapier.spelertypes;

import be.kdg.steenschaarpapier.Antwoord;
import be.kdg.steenschaarpapier.spelertypes.Deelnemer;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public class JefPapier implements Deelnemer {

private String naam;
private Antwoord tegenstander;

public static final Antwoord ANTWOORD = Antwoord.PAPIER;

public JefPapier(String naam){
    this.naam = naam;
}

    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public void ditZeiTegenstander(Antwoord antwoord) {
        tegenstander = antwoord;
    }

    @Override
    public Antwoord getAntwoord() {
        return ANTWOORD;
    }
}
