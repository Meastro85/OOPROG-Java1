import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * Vincent Verboven
 * 18/11/2022
 */
public class ChatBot {
    private String naam;
    private Random gen;
    private String[] antwoorden;

    public ChatBot(String naam){
        this.naam = naam;
        this.gen = new Random();
        this.antwoorden = new String[]{"Ok, probeer eerst al eens te herstarten",
                "Kan je het probleem eens herformuleren?",
                "En is dat al lang zo?",
                "Waarom heb je ons niet eerder gecontacteerd?",
                "Ik denk dat je dat zelf wel kan oplossen, niet?",
                "Die vraag heb ik nog niet vaak gehad!",
                "Sorry, ik was even bezig, kan je de vraag eens herhalen?",
                "Aha, gekend probleem, ik zoek het op en laat je iets weten.",
                "Sorry, daar heb ik niet direct een antwoord op. Wat nu?",
                "En dan?",
                "Dat zal wel, maar er zijn ergere dingen he.",
                "Hmm, die moet ik opzoeken. En wanneer deed dat zich juist voor?"};
    }

    @Override
    public String toString() {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime nu = LocalDateTime.now();
        return String.format("%s\n" +
                "Hallo, ik ben chatbot %s, stel me een vraag en ik geef je een oplossing!\n" +
                "Tik \"stop\" om te eindigen", nu.format(myFormat),this.naam );
    }

    public String antwoordOpVraag(String vraag){
        if( vraag.equalsIgnoreCase("stop")){
            return "Je hebt blijkbaar geen vragen meer. Ok, dan ben ik weg. De groeten van " + this.naam;
        } else if(vraag.length() < 4 ){
            return " ";
        } else {
            return this.antwoorden[gen.nextInt(0,12)];
        }
    }



}
