
public class DemoSpeedTest {
    public static void main(String[] args) {
        // We gaan de SpeedTest uitvoeren met telkens 100 000 willekeurige getallen
        SpeedTest speedTest = new SpeedTest(100000);

        System.out.println(speedTest.testInsertFirst());
        System.out.println(speedTest.testInsertLast());
        System.out.println(speedTest.testInsertMiddle());
        System.out.println(speedTest.testDeleteFirst());
        System.out.println(speedTest.testGet());
        System.out.println(speedTest.testSorteren());
    }
}

/*
Test vooraan toevoegen bij een lijst van 100000 elementen:
ArrayList: 737 ms <=> LinkedList:   6 ms ==> LinkedList wint!

Test achteraan toevoegen bij een lijst van 100000 elementen:
ArrayList:   7 ms <=> LinkedList:   4 ms ==> LinkedList wint!

Test vooraan verwijderen bij een lijst van 100000 elementen:
ArrayList: 699 ms <=> LinkedList:   2 ms ==> LinkedList wint!

Test elementen opzoeken bij een lijst van 100000 elementen:
ArrayList:   4 ms <=> LinkedList:  90 ms ==> ArrayList wint!

Test sorteren bij een lijst van 100000 elementen:
ArrayList:  44 ms <=> LinkedList:  25 ms ==> LinkedList wint!
 */