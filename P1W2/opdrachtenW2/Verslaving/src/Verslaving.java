import java.util.Objects;
import java.util.Scanner;

/**
 * Vincent Verboven
 * 30/09/2022
 */
public class Verslaving {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int GebruikerTeller = 0;
        int ErnstigeVormTeller = 0;
        int ernstig = 0;
        String advies = null;
        String loop = "J";
        while (loop.equals("J")) {
            if (GebruikerTeller != 0) {
                double ErnstigeGebruikers = (ErnstigeVormTeller / GebruikerTeller) * 100;
                System.out.println("Deze enquete werd reeds door " + GebruikerTeller + " ingevuld, " + ErnstigeGebruikers + "% hiervan had een ernstige of extreme vorm van digitale verslaving.");
            }
            int JaTeller = 0;
            int NeeTeller = 0;
            ernstig = 0;
            System.out.print("Wat is je naam? ");
            String naam = Input.nextLine();
            System.out.println("Dag " + naam + " beantwoord volgende ja/nee vragen:");
            System.out.print("Het laatste wat ik doe -voor ’s avonds het licht uit gaat- is nog snel even kijken of er nog iets aan berichten, enz is binnengekomen op mijn smartphone: ");
            String antwoord1 = Input.nextLine();
            if (Objects.equals(antwoord1, "ja")) {
                JaTeller++;
            } else if (Objects.equals(antwoord1, "nee")) {
                NeeTeller++;
            }
            System.out.print("Het eerste wat ik doe -al ’s morgens het licht aangaat- is kijken of er berichten, enz zijn binnengekomen op mijn smartphone: ");
            String antwoord2 = Input.nextLine();
            if (Objects.equals(antwoord2, "ja")) {
                JaTeller++;
            } else if (Objects.equals(antwoord2, "nee")) {
                NeeTeller++;
            }
            System.out.print("Ik heb notificaties (die een geluidje/of een trilbeweging maken) geactiveerd op mijn smartphone: ");
            String antwoord3 = Input.nextLine();
            if (Objects.equals(antwoord3, "ja")) {
                JaTeller++;
            } else if (Objects.equals(antwoord3, "nee")) {
                NeeTeller++;
            }
            System.out.print("Wanneer ik merk dat er een notificatie op mijn smartphone is binnen gekomen, kijk ik binnen de minuut op mijn smartphone wat het precies is: ");
            String antwoord4 = Input.nextLine();
            if (Objects.equals(antwoord4, "ja")) {
                JaTeller++;
            } else if (Objects.equals(antwoord4, "nee")) {
                NeeTeller++;
            }
            System.out.print("Terwijl ik naar een tv-reeks of film kijk op TV of computerscherm, gebruik ik één of meerdere keren mijn smartphone. ");
            String antwoord5 = Input.nextLine();
            if (Objects.equals(antwoord5, "ja")) {
                JaTeller++;
            } else if (Objects.equals(antwoord5, "nee")) {
                NeeTeller++;
            }
            System.out.print("Als ik alleen eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens de maaltijd. ");
            String antwoord6 = Input.nextLine();
            if (Objects.equals(antwoord6, "ja")) {
                JaTeller++;
            } else if (Objects.equals(antwoord6, "nee")) {
                NeeTeller++;
            }
            System.out.print("Als ik in gezelschap -familie, vrienden,...eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens de maaltijd. ");
            String antwoord7 = Input.nextLine();
            if (Objects.equals(antwoord7, "ja")) {
                JaTeller++;
            } else if (Objects.equals(antwoord7, "nee")) {
                NeeTeller++;
            }
            System.out.print("Als ik sta te wachten (op een bus, trein, tram, een vriend(in),..), gebruik ik mijn smartphone. ");
            String antwoord8 = Input.nextLine();
            if (Objects.equals(antwoord8, "ja")) {
                JaTeller++;
            } else if (Objects.equals(antwoord8, "nee")) {
                NeeTeller++;
            }
            System.out.print("Als in -alleen- op straat loop doe ik dat met mijn smartphone in de hand en kijk ik geregeld naar het scherm. ");
            String antwoord9 = Input.nextLine();
            if (Objects.equals(antwoord9, "ja")) {
                JaTeller++;
            } else if (Objects.equals(antwoord9, "nee")) {
                NeeTeller++;
            }
            System.out.print("Als ik fiets of met de auto rij, durf ik wel eens de smartphone in de hand te nemen en naar het scherm te kijken. ");
            String antwoord10 = Input.nextLine();
            if (Objects.equals(antwoord10, "ja")) {
                JaTeller++;
            } else if (Objects.equals(antwoord10, "nee")) {
                NeeTeller++;
            }
            if (JaTeller == 0) {
                System.out.println(naam + " je bent niet digitaal verslaafd. Houden zo!");
                advies = "Je bent niet digitaal verslaafd. Houden zo!";
            } else if (JaTeller >= 1 && JaTeller <= 2) {
                System.out.println(naam + " je hebt een milde vorm van digitale verslaving.");
                advies = "Je hebt een milde vorm van digitale verslaving.";
            } else if (JaTeller >= 3 && JaTeller <= 5) {
                System.out.println(naam + " je hebt een niet te onderschatten vorm van digitale verslaving. Leg jezelf wat beperkingen op.");
                advies = "Je hebt een niet te onderschatten vorm van digitale verslaving. Leg jezelf wat beperkingen op.";
            } else if (JaTeller >= 6 && JaTeller <= 8) {
                System.out.println(naam + " je hebt een ernstige vorm van digitale verslaving. Overweeg om een digitale detox-cursus te volgen!");
                ErnstigeVormTeller++;
                advies = "Je hebt een ernstige vorm van digitale verslaving. Overweeg om een digitale detox-cursus te volgen!";
            } else if (JaTeller >= 9) {
                System.out.println(naam + " je hebt een extreme vorm van digitale verslaving. Je hebt waarschijnlijk professionele hulp nodig!");
                ErnstigeVormTeller++;
                ernstig = 1;
                advies = "Je hebt een extreme vorm van digitale verslaving. Je hebt waarschijnlijk professionele hulp nodig!";
            }
            if (ernstig == 1) {
                System.out.print(naam + " hoeveel uur per dag zit je op je smartphone? ");
                double schermTijd = Input.nextDouble();
                double schermTijdProcent = (schermTijd / 24) * 100;
                if (schermTijdProcent > 80) {
                    System.out.println("Je spendeert " + schermTijdProcent + "% van de dag aan je smartphone. Jouw verslaving vormt een gevaar voor jezelf en jouw omgeving. Zoek zo snel mogelijk hulp!!");
                } else if (schermTijdProcent >= 20 && schermTijdProcent <= 80) {
                    System.out.println(" Je spendeert " + schermTijdProcent + "% van de dag aan je smartphone. We adviseren je om professionele hulp in te roepen.");
                } else if (schermTijdProcent < 20) {
                    System.out.println(" Je spendeert " + schermTijdProcent + "% van de dag aan je smartphone. Vreemd, ben je zeker dat je de enquete eerlijk ingevuld hebt? Wees eerlijk tegenover jezelf!");
                }

                System.out.println("Overzichtsrapport: ");
                System.out.println(naam);
                System.out.println("Het laatste wat ik doe -voor ’s avonds het licht uit gaat- is nog snel even kijken of er nog iets aan berichten, enz is binnengekomen op mijn smartphone: " + antwoord1);
                System.out.println("Het eerste wat ik doe -al ’s morgens het licht aangaat- is kijken of er berichten, enz zijn binnengekomen op mijn smartphone: " + antwoord2);
                System.out.println("Ik heb notificaties (die een geluidje/of een trilbeweging maken) geactiveerd op mijn smartphone: " + antwoord3);
                System.out.println("Wanneer ik merk dat er een notificatie op mijn smartphone is binnen gekomen, kijk ik binnen de minuut op mijn smartphone wat het precies is: " + antwoord4);
                System.out.println("Terwijl ik naar een tv-reeks of film kijk op TV of computerscherm, gebruik ik één of meerdere keren mijn smartphone. " + antwoord5);
                System.out.println("Als ik alleen eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens de maaltijd. " + antwoord6);
                System.out.println("Als ik in gezelschap -familie, vrienden,...eet (ontbijt/lunch/diner) gebruik ik meermaals mijn smartphone tijdens de maaltijd. " + antwoord7);
                System.out.println("Als ik sta te wachten (op een bus, trein, tram, een vriend(in),..), gebruik ik mijn smartphone. " + antwoord8);
                System.out.println("Als in -alleen- op straat loop doe ik dat met mijn smartphone in de hand en kijk ik geregeld naar het scherm. " + antwoord9);
                System.out.println("Als ik fiets of met de auto rij, durf ik wel eens de smartphone in de hand te nemen en naar het scherm te kijken. " + antwoord10);
                System.out.println("Aantal ja antwoorden: " + JaTeller);
                if (ernstig == 1) {
                    System.out.println("Je spendeert " + schermTijdProcent + "% van de dag aan je smartphone.");
                }
                System.out.println("Ons advies: " + advies);
                System.out.print("Wil je nog een enquete invullen? (J/N) ");
                loop = Input.nextLine();
                GebruikerTeller++;
            }
        }
    }
}
