package be.kdg.demo;

import be.kdg.steenschaarpapier.Tornooi;
import be.kdg.steenschaarpapier.spelertypes.HarryRandom;
import be.kdg.steenschaarpapier.spelertypes.JefPapier;
import be.kdg.steenschaarpapier.spelertypes.Mens;
import be.kdg.steenschaarpapier.spelertypes.RikRepeat;

//TODO
//Deze applicatie simuleert een STEEN-SCHAAR-PAPIER tornooi
//Deelnemers moeten de Deelnemer interface implementeren
//TODO:
// - voorzie een aantal implementaties van de interface:
//      - Jef Papier: antwoord altijd PAPIER
//      - Rik Ripiet: antwoord altijd hetgeen de vorige keer tegen hem gezegd werd
//      - Harry Random: antwoord willekeurig
//      - Mens: gebruikt Scanner om aan de gebruiker te vragen wat hij wil doen
// Voeg nu de implementaties toe en speel het tornooi!
public class Main {
    public static void main(String[] args) {
        Tornooi tornooi = new Tornooi();
        //voeg nog deelnemers toe
        tornooi.addDeelnemer(new HarryRandom("Harry"));
        tornooi.addDeelnemer(new HarryRandom("Barry"));
        tornooi.addDeelnemer(new HarryRandom("Larry"));
        tornooi.addDeelnemer(new RikRepeat("Rik"));
        tornooi.addDeelnemer(new RikRepeat("Bob"));
        tornooi.addDeelnemer(new JefPapier("Jef"));
        tornooi.addDeelnemer(new HarryRandom("Henk"));
        tornooi.addDeelnemer(new Mens("Job"));
        tornooi.start();
    }
}
