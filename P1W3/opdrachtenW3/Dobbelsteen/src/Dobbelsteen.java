/**
 * Vincent Verboven
 * 3/10/2022
 */
public class Dobbelsteen {
    public static void main(String[] args) {
        int een = 0;
        int twee = 0;
        int drie = 0;
        int vier = 0;
        int vijf = 0;
        int zes = 0;
        for(int i = 0; i <=6000 ; i++){
            int random = ( int )(Math.random() * 6 + 1);
            switch (random) {
                case 1 : een++ ; break;
                case 2 : twee++ ; break;
                case 3 : drie++ ; break;
                case 4 : vier++ ; break;
                case 5 : vijf++ ; break;
                case 6 : zes++ ; break;
            }
        }
        System.out.println("Aantal enen: " + een);
        System.out.println("Aantal tweeën: " + twee);
        System.out.println("Aantal drieën: " + drie);
        System.out.println("Aantal vieren: " + vier);
        System.out.println("Aantl vijfen: " + vijf);
        System.out.println("Aantal zessen: " + zes);
    }
}
