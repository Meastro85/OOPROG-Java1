package geometry;

/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(){
    }

    public Rectangle(int x, int width, int y, int height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return (2*height) + (2*width);
    }

    @Override
    public String toString() {
        return String.format("RECTANGLE (x = %d, y = %d; width = %d, height = % d)", super.getX() , super.getY(), width, height);
    }
}