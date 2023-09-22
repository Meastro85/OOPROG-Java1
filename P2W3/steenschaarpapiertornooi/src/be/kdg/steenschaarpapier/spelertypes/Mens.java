package be.kdg.steenschaarpapier.spelertypes;

import be.kdg.steenschaarpapier.Antwoord;

import java.util.Scanner;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public class Mens implements Deelnemer {

    private Scanner Input = new Scanner(System.in);
    private String naam;
    private Antwoord antwoord;
    private Antwoord tegenstander;

    public Mens(String naam) {
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
        System.out.println("""
                Maak een keuze:
                1. steen
                2. schaar
                3. papier
                """);
        antwoord = Antwoord.values()[Input.nextInt() - 1];
        return antwoord;
    }
}
