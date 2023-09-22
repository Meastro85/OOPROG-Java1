import java.util.Scanner;

/**
 * Vincent Verboven
 * 14/10/2022
 */
public class Hartslagzones {
    public static void hartslagMeting() {
        System.out.println("start");
        for (int i = 15; i > 0; i--) {
            System.out.print(i + " - ");
            try {
                Thread.sleep(1000); // 1 seconde wachten (1000 ms)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("stop\n");
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String jaNee;
        String jaNee2;
        String ok;
        int slagen;
        int rustHartslag = 0;
        int HRR;
        int maxHartslag = 0;
        int zone;
        int limiet1;
        int limiet2;
        do {
            System.out.print("Ken je je HRR? ");
            jaNee = Input.nextLine().toLowerCase();
            System.out.println(jaNee.charAt(0));
        } while (jaNee.charAt(0) != 'j' && jaNee.charAt(0) != 'n');
        if (jaNee.charAt(0) == 'j') {
            System.out.print("Geef nu de HRR: ");
            HRR = Input.nextInt();
        }
        do {
            System.out.print("Ken je je rusthartslag? ");
            jaNee2 = Input.nextLine().toLowerCase();
            System.out.println(jaNee2.charAt(0));
        } while (jaNee2.charAt(0) != 'j' && jaNee2.charAt(0) != 'n');
        if (jaNee2.charAt(0) == 'n') {
            System.out.println("Ga even rustig zitten en adem 10x diep in en uit");
            System.out.println("Indien je klaar bent typ je ok");
            ok = Input.next();
            if (ok.equals("ok")) {
                hartslagMeting();
                System.out.print("Geef het aantal slagen in: ");
                slagen = Input.nextInt();
                rustHartslag = slagen * 4;
            }
        } else {
            System.out.print("Geef je rusthartslag: ");
            rustHartslag = Input.nextInt();
        }
        System.out.println("Maximale hartslag berekenen");
        System.out.println("Interval 1: Ren 30 seconden op volle snelheid.\n" +
                "Herstelperiode 1: Rust 60 seconden.\n" +
                "Interval 2: Ren 30 seconden op volle snelheid.\n" +
                "Herstelperiode 2: Rust 60 seconden.\n" +
                "Interval 3: Ren 60 seconden op volle snelheid.");
        System.out.println("Indien je klaar bent typ je ok");
        ok = Input.next();
        if (ok.equals("ok")) {
            hartslagMeting();
            System.out.print("Geef het aantal slagen in: ");
            slagen = Input.nextInt();
            maxHartslag = slagen*4;
        }
        HRR = maxHartslag - rustHartslag;
        System.out.println("Je HRR is: " + HRR);
        System.out.print("In welke zone wil je trainen (1-5): ");
        zone = Input.nextInt();
        System.out.println("Rusthartslag: " + rustHartslag + "\n"
        + "Maximale hartslag: " + maxHartslag + "\n"
        + "zone: " + zone);
        switch (zone){
            case 1:
                limiet1 = (int) (maxHartslag - rustHartslag * 0.5 + rustHartslag);
                limiet2 = (int) (maxHartslag - rustHartslag * 0.6 + rustHartslag);
                System.out.println("Limieten hartslag: tussen " + limiet1 + " en " + limiet2);
                break;
            case 2:
                limiet1 = (int) (maxHartslag - rustHartslag * 0.6 + rustHartslag);
                limiet2 = (int) (maxHartslag - rustHartslag * 0.7 + rustHartslag);
                System.out.println("Limieten hartslag: tussen " + limiet1 + " en " + limiet2);
                break;
            case 3:
                limiet1 = (int) (maxHartslag - rustHartslag * 0.7 + rustHartslag);
                limiet2 = (int) (maxHartslag - rustHartslag * 0.8 + rustHartslag);
                System.out.println("Limieten hartslag: tussen " + limiet1 + " en " + limiet2);
                break;
            case 4:
                limiet1 = (int) (maxHartslag - rustHartslag * 0.8 + rustHartslag);
                limiet2 = (int) (maxHartslag - rustHartslag * 0.9 + rustHartslag);
                System.out.println("Limieten hartslag: tussen " + limiet1 + " en " + limiet2);
                break;
            case 5:
                limiet1 = (int) (maxHartslag - rustHartslag * 0.9 + rustHartslag);
                limiet2 = (int) (maxHartslag - rustHartslag + rustHartslag);
                System.out.println("Limieten hartslag: tussen " + limiet1 + " en " + limiet2);
                break;
        }
    }
}
