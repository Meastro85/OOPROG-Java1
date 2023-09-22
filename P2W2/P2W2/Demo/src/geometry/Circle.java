package geometry;

/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getPerimeter(){
        return Math.PI * (2 * radius);
    }

    @Override
    public String toString() {
        return String.format("Circle ( x = %d, y = %d, radius = %d)",super.getX(),super.getY(),radius);
    }
}
