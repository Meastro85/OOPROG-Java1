package be.kdg.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
        List<Integer> myNumberList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myNumberList.add(i);
        }

        for (Iterator<Integer> iterator = myNumberList.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            System.out.print(number);
        }
        System.out.println();

        Integer[] getallenArray = myNumberList.toArray(new Integer[0]);
        // Integer[] getallenArray = (Integer[]) myNumberList.toArray();


        for (int getal : getallenArray) {
            System.out.print(getal);
        }
    }


}


