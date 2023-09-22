/**
 * Vincent Verboven
 * 30/11/2022
 */
public enum Color {
    RED,BLUE;

    @Override
    public String toString() {
        return String.format("%s",name().equals("RED") ? 'x' : 'o');
    }
}
