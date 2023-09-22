package geometry;

/**
 * Vincent Verboven
 * 21/11/2022
 */
public class Square extends Rectangle {

    private int side;

    public Square(){}

    public Square(int x, int y, int side){
        super(x , side, y, side);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
        super.setHeight(side);
        super.setWidth(side);
    }

    public int getSide() {
        return side;
    }

//    @Override
//    public double getArea(){
//        return side*side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return side*4;
//    }

    @Override
    public void setWidth(int width){
        setSide(width);
    }

    @Override
    public void setHeight(int height){
        setSide(height);
    }

    @Override
    public String toString() {
        return String.format("SQUARE (x = %d, y = %d; side = %d)", super.getX() , super.getY(), side);
    }
}
