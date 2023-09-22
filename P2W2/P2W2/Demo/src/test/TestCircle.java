package test;

import geometry.Circle;

/**
 * Vincent Verboven
 * 21/11/2022
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        Circle c2 = new Circle(1, 2, 3);
        System.out.println(c2);
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
    }
}
