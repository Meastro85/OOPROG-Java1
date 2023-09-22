package be.kdg.steenschaarpapier.spelertypes;

import be.kdg.steenschaarpapier.Antwoord;
import be.kdg.steenschaarpapier.spelertypes.Deelnemer;

import java.util.Random;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public class RikRepeat implements Deelnemer {

    private Random gen = new Random();
    private String naam;
    private Antwoord vorigAntwoord = Antwoord.values()[gen.nextInt(0,3)];
    private Antwoord tegenstander;

    public RikRepeat(String naam){
        this.naam = naam;
    }

    @Override
    public String getNaam() {
        return this.naam;
    }

    @Override
    public void ditZeiTegenstander(Antwoord antwoord) {
        tegenstander = antwoord;
        vorigAntwoord = antwoord;
    }

    @Override
    public Antwoord getAntwoord() {
        return vorigAntwoord;
    }
}
