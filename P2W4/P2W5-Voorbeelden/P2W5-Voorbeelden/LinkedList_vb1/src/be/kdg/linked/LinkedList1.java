package be.kdg.linked;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList1 {
    public static void main(String[] args) {
        String[] kleurenStrings = {"geel", "groen", "blauw", "paars", "rood"};
        String[] grijzeStrings = {"zwart", "wit", "grijs", "zilver"};

        List<String> kleurenList = new LinkedList<>();
        List<String> grijzeList = new LinkedList<>();

        kleurenList.addAll(Arrays.asList(kleurenStrings));
        grijzeList.addAll(Arrays.asList(grijzeStrings));
        kleurenList.addAll(grijzeList);

        System.out.println("kleuren: " + kleurenList);
        kleurenList.subList(4, 6).clear();
        System.out.println("na verwijderen: " + kleurenList);

        ListIterator<String> iterator = kleurenList.listIterator(kleurenList.size());
        System.out.print("Omgekeerde kleuren: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}
