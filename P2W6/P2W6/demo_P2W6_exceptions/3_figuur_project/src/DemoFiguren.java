import geometry.Rectangle;

import java.util.Scanner;

public class DemoFiguren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean allesOK;
        do{
            try{
                System.out.println("Geef de lengte van de rechthoek ");
                int breedte = scanner.nextInt();
                int lengte = scanner.nextInt();
                Rectangle r = new Rectangle(0,0,breedte,lengte);
                System.out.println(r);
                System.out.println("Oppervlakte: " + r.getArea());
                allesOK = true;
            } catch (IllegalArgumentException e){
                System.out.println("FOUT! " + e.getMessage());
                allesOK = false;
            }
        }while(allesOK);
        System.out.println("Tot ziens");
    }
}
