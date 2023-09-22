package test;

import geometry.Circle;
import geometry.Rectangle;
import geometry.Shape;
import geometry.Square;

/**
 * Vincent Verboven
 * 24/11/2022
 */
public class TestPolymorfisme {
    public static void main(String[] args) {
        //een aantal figuren in een array:
        Shape[] figuren = {new Rectangle(5, 8, 1, 1), new Rectangle(), new Square(10, 45, 85), new Square(), new Circle(10, 2, 4), new Circle(1, 1, 1)};
//eigenschappen van de elementen afdrukken:
        for (Shape figuur : figuren) {
            System.out.println(figuur.toString());
            System.out.println("\t opp:  " + figuur.getArea());
            System.out.println("\t omtr: " + figuur.getPerimeter());
        }
    }
}
