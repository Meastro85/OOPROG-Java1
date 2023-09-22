package geometry;

/**
 * De klasse Shape vormt de superklasse van de anderen
 */
public class Shape implements Printable, Scalable {
    private int x;
    private int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getArea() {
        return 0.0; //puur om de compiler te sussen
    }

    public double getPerimeter() {
        return 0.0; //puur om de compiler te sussen
    }

    @Override
    public String toString() {
        return String.format("SHAPE (x = %d, y = %d)",
                x, y);
    }

    @Override
    public void printOnScreen() {
        System.out.println(this);
//        for (int i = 0; i < this.y; i++){
//            for(int j = 0; j < this.x; j++){
//                if(j == 0 || j == x - 1){
//                    System.out.print("|");
//                    if(j == x-1){
//                        System.out.println();
//                    }
//                } else if(i == 0 || i == y-1){
//                    System.out.print("-");}
//                else {
//                    System.out.print(" ");
//                }
//            }
//        }
    }

    @Override
    public void scale(double scale) {
        this.x *= scale;
        this.y *= scale;
    }
}
