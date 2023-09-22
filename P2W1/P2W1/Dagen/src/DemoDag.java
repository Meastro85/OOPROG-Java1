/**
 * Vincent Verboven
 * 14/11/2022
 */
public class DemoDag {
    public static void main(String[] args) {
        for(Dag dag : Dag.values()){
            System.out.println(dag);
            System.out.println("Afgekort: " + dag.getAfkorting());
        }
    }
}
