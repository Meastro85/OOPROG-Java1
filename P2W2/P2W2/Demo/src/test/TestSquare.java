package test;

import geometry.Square;

/**
 * Vincent Verboven
 * 21/11/2022
 */
public class TestSquare {
    public static void main(String[] args) {
        Square s1 = new Square();
        System.out.println(s1);
        System.out.println("opp= " + s1.getArea());
        System.out.println("omtr.= " + s1.getPerimeter());

        Square s2 = new Square(1,2,3);
        System.out.println(s2);
        System.out.println("opp= " + s2.getArea());
        System.out.println("omtr.= " + s2.getPerimeter());
        s2.setHeight(5);
        System.out.println(s2);
        System.out.println("opp= " + s2.getArea());
        System.out.println("omtr.= " + s2.getPerimeter());
    }
}
