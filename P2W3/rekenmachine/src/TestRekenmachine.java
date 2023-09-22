import rekenen.*;
import rekenen.plugins.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

/**
 * PEER TUTORING
 * REKENMACHINE
 */
public class TestRekenmachine {
    private static Rekenmachine mijnCalc = new Rekenmachine();

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String command;
        double x;
        double y;
        String[] numbers;
        StringBuilder log = new StringBuilder();
        //Opgave 3.1

        class MIN implements Plugin{
            double x;
            double y;

            @Override
            public String getCommand() {
                return "MIN";
            }

            @Override
            public double bereken(double x, double y) {
                return Math.min(x, y);
            }

            @Override
            public String getAuteur() {
                return "ANONIEM";
            }
        }

        class MAX implements Plugin{
            double x;
            double y;

            @Override
            public String getCommand() {
                return "MAX";
            }

            @Override
            public double bereken(double x, double y) {
                return Math.max(x,y);
            }

            @Override
            public String getAuteur() {
                return "ANONIEM";
            }

        }

        mijnCalc.installeer(new Optelling());
        mijnCalc.installeer(new Aftrekking());
        mijnCalc.installeer(new Vermenigvuldiging());
        mijnCalc.installeer(new Deling());
        mijnCalc.installeer(new Macht());
        mijnCalc.installeer(new MAX());
        mijnCalc.installeer(new MIN());



//
//        //Opgave 3.3
//
//        doeBerekeningEnDrukAf("+", 5, 2);
//        doeBerekeningEnDrukAf("-", 5, 2);
//        doeBerekeningEnDrukAf("*", 5, 2);
//        doeBerekeningEnDrukAf("/", 5, 2);
//        doeBerekeningEnDrukAf("^", 5, 2);
//        doeBerekeningEnDrukAf("?", 5, 2);
//        System.out.println(mijnCalc.toString());


        //Opgave 3.2
        System.out.println("Welkom bij de dynamische rekenmachine!");
        do{
            System.out.println(mijnCalc.toString());
            System.out.print("Welke berekening wenst U uit te voeren (<ENTER> om te stoppen)? ");
            command = Input.nextLine();
            if(!command.equals("")) {
                System.out.print("Geef twee getallen in (gescheiden door spatie) ");
                numbers = Input.nextLine().split(" ");
                x = Double.parseDouble(numbers[0]);
                y = Double.parseDouble(numbers[1]);
                doeBerekeningEnDrukAf(command,x,y);
                String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("d MMMM yyyy H:m:s"));
                String logString = String.format("[%s] %f %s %f = %f ",currentTime,x,command,y,mijnCalc.bereken(command,x,y));
                log.append(logString).append("\n");
            }
        }while(!command.equals(""));
        System.out.println(getLog(log));
    }

    //Opgave 3.1
    private static void doeBerekeningEnDrukAf(String commando, double getal1, double getal2){
        System.out.printf("%.2f %s %.2f = %.2f\n"
                , getal1, commando, getal2
                , mijnCalc.bereken(commando, getal1, getal2));
    }

    private static String getLog(StringBuilder log){
        return log.toString();
    }


}
