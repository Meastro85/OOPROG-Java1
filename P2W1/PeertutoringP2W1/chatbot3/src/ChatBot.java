import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
    private String[] zoekwoorden;
    private String[] nonsensAntwoorden;
    private LocalTime stop;
    private LocalTime start;
    private StringBuilder antwoord;
    private int teller = 0;
    private String[] scheldWoorden;
    private Boolean scheldboete = false;
    private Duration tijdsduur;



    public ChatBot(String naam) {
        this.naam = naam;
        this.gen = new Random();
        this.nonsensAntwoorden = new String[]{"Ok, probeer eerst al eens te herstarten",
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

        this.zoekwoorden = new String[]{"aanloggen", "traag", "scherm", "hangt", "kleuren", "trager", "geluid",
                "vooruit", "niet", "gisteren", "weekend", "geen idee", "oplossing",
                "geen", "zeker"};

        this.antwoorden = new String[]{"Probeer opnieuw aan te loggen, lost dat je probleem op?",
                "Herstarten van het systeem kan vele snelheidsproblemen oplossen. Heb je dat al geprobeerd?",
                "Misschien is er iets mis met de video adapter?",
                "Je kan best nog even wachten, mogelijk lost het probleem zichzelf op.",
                "Heb je onlangs nieuwe videosoftware geïnstalleerd?",
                "Is er nog voldoende ruimte vrij op het toestel?",
                "Het volume staat toch juist he?",
                "Mogelijk een probleem met één van de systeemdrivers.",
                "Pas op, soms wel hoor.",
                "En eergisteren?",
                "In de week werken die dingen meestal vlotter...",
                "Niet wanhopen, we vinden samen wel een oplossing.",
                "Ik zal het wel oplossen, geef jij mij gewoon wat meer info.",
                "Echt geen?",
                "Ik ken dat 'zeker', uiteindelijk blijkt het toch niet!"};

        this.scheldWoorden = new String[]{"Idioot"};
    }

    @Override
    public String toString() {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime nu = LocalDateTime.now();
        return String.format("%s\n" +
                "Hallo, ik ben chatbot %s, stel me een vraag en ik geef je een oplossing!\n" +
                "Tik \"stop\" om te eindigen", nu.format(myFormat), this.naam);
    }

    public String antwoordOpVraag(String vraag) {
        teller++;
        for(int i = 0; i < scheldWoorden.length; i++){
            if(vraag.toLowerCase().contains(scheldWoorden[i])){
                this.scheldboete = true;
                return "Gelieve beleefd te blijven!";
            }
        }
        if (vraag.equalsIgnoreCase("stop")) {
            StopGesprek();
            tijdsduur = Duration.between(start,stop);
            return String.format("Je hebt blijkbaar geen vragen meer. Ok, dan ben ik weg. De groeten van %s\n" +
                    "Dit gesprek duurde %s sec.", this.naam,tijdsduur.getSeconds());
        } else if (vraag.length() <= 4) {
            return " ";
        } else {
            for (int i = 0; i < zoekwoorden.length; i++) {
                if (vraag.toLowerCase().contains(zoekwoorden[i])) {
                    if(teller >= 5){
                        return "Zucht, typisch. " + this.antwoorden[i];
                    } else {
                        return this.antwoorden[i];
                    }
                }
            }
        }
        if(teller >= 5){
            return "Zucht, typisch. " + this.nonsensAntwoorden[gen.nextInt(0, nonsensAntwoorden.length)];
        } else {
            return this.nonsensAntwoorden[gen.nextInt(0, nonsensAntwoorden.length)];
        }
    }

    public void startGesprek(){
        this.start = LocalTime.now();
    }

    public void StopGesprek() {
        this.stop = LocalTime.now();
    }
}
