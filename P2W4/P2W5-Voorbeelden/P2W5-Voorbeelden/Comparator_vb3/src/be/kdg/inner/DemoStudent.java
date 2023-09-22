package be.kdg.inner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoStudent {
    // static inner class
    static class NummerComparator implements Comparator<Student> {
        @Override
        public int compare(Student een, Student twee) {
            return een.getNummer() - twee.getNummer();
        }
    }

    public static void main(String[] args) {
        List<Student> klasgroep = new ArrayList<>();
        klasgroep.add(new Student("Kevin", 20));
        // Studenten worden toegevoegd ...
        klasgroep.add(new Student("Carlos", 55));
        klasgroep.add(new Student("Nico", 6));
        klasgroep.add(new Student("Pascal", 94));
        klasgroep.add(new Student("Lewis", 44));
        klasgroep.add(new Student("Daniel", 3));
        klasgroep.add(new Student("Stoffel", 2));
        klasgroep.add(new Student("Max", 33));
        klasgroep.add(new Student("Sebastian", 5));
        klasgroep.add(new Student("Sergio", 11));
        klasgroep.add(new Student("Fernando", 14));
        klasgroep.add(new Student("Romain", 8));
        Collections.sort(klasgroep);
        // ...
        Collections.sort(klasgroep, new Comparator<Student>() {
            @Override
            public int compare(Student een, Student twee) {
                return een.getNummer() - twee.getNummer();
            }
        });

        klasgroep.forEach(System.out::println);
    }
}


/* sort(klasgroep)
Carlos     55
Daniel      3
Fernando   14
Kevin      20
Lewis      44
Max        33
Nico        6
Pascal     94
Romain      8
Sebastian   5
Sergio     11
Stoffel     2
 */

/* sort(klasgroep, new NummerComparator());
Stoffel     2
Daniel      3
Sebastian   5
Nico        6
Romain      8
Sergio     11
Fernando   14
Kevin      20
Max        33
Lewis      44
Carlos     55
Pascal     94
 */