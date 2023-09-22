package golven;

import java.awt.*;
import java.util.Random;

/**
 * Vincent Verboven
 * 28/10/2022
 */
public class GolvenGrafiek {
    Golf golf = new Golf();
    Golf[] golven;
    Random random;

    public GolvenGrafiek(int aantalGolven){
        golven = new Golf[aantalGolven];
        random = new Random();
    }

    public void maakGolven(){
        for(int i = 0; i < golven.length; i++){
            golven[i] = new Golf();
            golven[i].setAmplitude(random.nextDouble(0.1,4));
            golven[i].setFrequentie(random.nextDouble(0.1,4));
            golven[i].setFase((random.nextDouble(-1,1)));
        }
    }
    public void tekenGolven(){
        GrafiekWindow grafiekWindow = new GrafiekWindow(10,6);
        for(Golf golf: this.golven){
            for(double i = -5; i < 10;i+=0.01){
                grafiekWindow.tekenPunt(i,golf.getYwaarde(i), Color.BLUE);
            }
        }
        grafiekWindow.toon();
    }
}
