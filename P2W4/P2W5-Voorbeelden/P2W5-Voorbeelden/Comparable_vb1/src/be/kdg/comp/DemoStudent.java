package be.kdg.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoStudent {
    public static void main(String[] args) {
        List<Student> studenten = new ArrayList<>();
        studenten.add(new Student("Kevin", 20));
        studenten.add(new Student("Carlos", 55));
        studenten.add(new Student("Nico", 6));
        studenten.add(new Student("Pascal", 94));
        studenten.add(new Student("Lewis", 44));
        studenten.add(new Student("Daniel", 3));
        studenten.add(new Student("Stoffel", 2));
        studenten.add(new Student("Max", 33));
        studenten.add(new Student("Sebastian", 5));
        studenten.add(new Student("Sergio", 11));
        studenten.add(new Student("Fernando", 14));
        studenten.add(new Student("Romain", 8));
        // ...
        Collections.sort(studenten);

        studenten.forEach(System.out::println);
    }
}

/*
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