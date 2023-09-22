package be.kdg.steenschaarpapier.spelertypes;

import be.kdg.steenschaarpapier.Antwoord;

import java.util.Random;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public class HarryRandom implements Deelnemer{

    private Random gen;
    private String naam;
    private Antwoord antwoord;
    private Antwoord tegenstander;

    public HarryRandom(String naam){
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
        gen = new Random();
        antwoord = Antwoord.values()[gen.nextInt(0,3)];
        return antwoord;
    }
}
