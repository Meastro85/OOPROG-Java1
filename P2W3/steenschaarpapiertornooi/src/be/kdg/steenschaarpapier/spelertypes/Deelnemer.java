package be.kdg.steenschaarpapier.spelertypes;

import be.kdg.steenschaarpapier.Antwoord;

public interface Deelnemer {
    String getNaam();
    void ditZeiTegenstander(Antwoord antwoord);
    Antwoord getAntwoord();
}
