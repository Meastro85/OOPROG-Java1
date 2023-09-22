package be.kdg.para;

import java.util.Comparator;

/**
 * Created by Kristiaan on 10/12/2016.
 */
public class NummerComparator implements Comparator<Student> {
    @Override
    public int compare(Student een, Student twee) {
        return een.getNummer() - twee.getNummer();
    }
}
