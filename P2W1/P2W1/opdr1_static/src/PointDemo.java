import metrics.Point;

/**
 * Vincent Verboven
 * 14/11/2022
 */
public class PointDemo {
    public static void main(String[] args) {
        Point punt1 = new Point();
        System.out.println(punt1);
        System.out.println(Point.count);
        System.out.println(Point.COLOR);
        Point punt2 = new Point(5,15);
        System.out.println(punt2);
        System.out.println(Point.count);
        System.out.println(Point.COLOR);
        Point punt3 = new Point(123,125);
        System.out.println(punt3);
        System.out.println(Point.count);
        System.out.println(Point.COLOR);
    }
}
