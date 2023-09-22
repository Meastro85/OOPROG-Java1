package test;

import geometry.Circle;
import geometry.Rectangle;
import geometry.Shape;
import geometry.Square;

/**
 * Vincent Verboven
 * 28/11/2022
 */
public class TestInterfaces {
    public static void main(String[] args) {
        Shape[] figuren = {
                new Rectangle(5, 8, 1, 1),
                new Rectangle(),
                new Square(10, 45, 85),
                new Square(),
                new Circle(10, 2, 4),
                new Circle(1, 1, 1)};

        for (Shape figuur : figuren) {
            figuur.printOnScreen();
        }
    }
}
