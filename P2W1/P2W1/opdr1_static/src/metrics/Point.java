package metrics;

/**
 * Vincent Verboven
 * 14/11/2022
 */
public class Point {
    private int x;
    private int y;
    public static final String COLOR = "red";
    public static int count =0;

    public Point() {
        Point.count++;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
        Point.count++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("metrics.Point (%d, %d)",x,y);
    }
}