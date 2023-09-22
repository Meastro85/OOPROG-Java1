package be.kdg.para;

/**
 * Created by Kristiaan on 10/12/2016.
 */
public class Student implements Comparable<Student> {
    private String naam;
    private int nummer;

    public Student(String naam, int nummer) {
        this.naam = naam;
        this.nummer = nummer;
    }

    public int getNummer() {
        return nummer;
    }

    public int compareTo(Student andereStudent) {
        return this.naam.compareTo(andereStudent.naam);
    }

    @Override
    public String toString() {
        return String.format("%-10s %2d", naam, nummer);
    }
}

