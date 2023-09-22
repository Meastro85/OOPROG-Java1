import java.util.*;

public class SpeedTest {
    private Random random = new Random();

    private List<Integer> anArrayList = new ArrayList<>();
    private List<Integer> aLinkendList = new LinkedList<>();

    private final int testGrootte; // Hoeveel getallen moeten er in de lijsten gestoken worden
    private final int MAXIMUM_GETAL;  // Wat is het hoogst mogelijke getal in de lijst

    public  SpeedTest(int aantalGetallen){
        testGrootte = aantalGetallen;
        MAXIMUM_GETAL = 1000;
    }

    private void maakLists() {
        anArrayList.clear();
        aLinkendList.clear();
        for (int i = 0; i < testGrootte; i++) {
            int randomGetal = random.nextInt(MAXIMUM_GETAL);
            anArrayList.add(randomGetal);
            aLinkendList.add(randomGetal);
        }
    }

    public SpeedTestResult testInsertLast() {
        anArrayList.clear();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < testGrootte; i++) {
            anArrayList.add(random.nextInt(MAXIMUM_GETAL));
        }
        long arrayListTimer = System.currentTimeMillis() - startTime;

        aLinkendList.clear();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < testGrootte; i++) {
            aLinkendList.add(random.nextInt(MAXIMUM_GETAL));
        }
        long linkedListTimer = System.currentTimeMillis() - startTime;

        return new SpeedTestResult("achteraan toevoegen", this.testGrootte, arrayListTimer, linkedListTimer);
    }

    public SpeedTestResult testInsertFirst() {
        anArrayList.clear();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < testGrootte; i++) {
            anArrayList.add(0, random.nextInt(MAXIMUM_GETAL));
        }
        long arrayListTimer = System.currentTimeMillis() - startTime;

        aLinkendList.clear();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < testGrootte; i++) {
            aLinkendList.add(0, random.nextInt(MAXIMUM_GETAL));
        }
        long linkedListTimer = System.currentTimeMillis() - startTime;

        return new SpeedTestResult("vooraan toevoegen", this.testGrootte, arrayListTimer, linkedListTimer);
    }

    public SpeedTestResult testInsertMiddle() {
        anArrayList.clear();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < testGrootte; i++) {
            anArrayList.add(i / 2, random.nextInt(MAXIMUM_GETAL));
        }
        long arrayListTimer = System.currentTimeMillis() - startTime;

        aLinkendList.clear();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < testGrootte; i++) {
            aLinkendList.add(i / 2, random.nextInt(MAXIMUM_GETAL));
        }
        long linkedListTimer = System.currentTimeMillis() - startTime;

        return new SpeedTestResult("in het midden toevoegen", this.testGrootte, arrayListTimer, linkedListTimer);
    }

    public SpeedTestResult testDeleteFirst() {
        maakLists();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < testGrootte; i++) {
            anArrayList.remove(0);
        }
        long arrayListTimer = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < testGrootte; i++) {
            aLinkendList.remove(0);
        }
        long linkedListTimer = System.currentTimeMillis() - startTime;

        return new SpeedTestResult("vooraan verwijderen", this.testGrootte, arrayListTimer, linkedListTimer);
    }

    public SpeedTestResult testGet() {
        maakLists();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < testGrootte; i++) {
            anArrayList.get(random.nextInt(MAXIMUM_GETAL));
        }
        long arrayListTimer = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < testGrootte; i++) {
            aLinkendList.get(random.nextInt(MAXIMUM_GETAL));
        }
        long linkedListTimer = System.currentTimeMillis() - startTime;

        return new SpeedTestResult("elementen opzoeken", this.testGrootte, arrayListTimer, linkedListTimer);
    }

    public SpeedTestResult testSorteren() {
        maakLists();
        long startTime = System.currentTimeMillis();
        Collections.sort(anArrayList);
        long arrayListTimer = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        Collections.sort(aLinkendList);
        long linkedListTimer = System.currentTimeMillis() - startTime;

        return new SpeedTestResult("sorteren", this.testGrootte, arrayListTimer, linkedListTimer);
    }
}
