package test;

import geometry.Rectangle;

/**
 * Vincent Verboven
 * 21/11/2022
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("opp: " + r1.getArea());
        System.out.println("omtr: "+ r1.getPerimeter());
        Rectangle r2 = new Rectangle(1, 3, 2, 4);
        System.out.println(r2);
        System.out.println("opp: " + r2.getArea());
        System.out.printf("omtr: " + r2.getPerimeter());
    }
}