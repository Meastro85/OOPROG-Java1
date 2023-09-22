/**
 * Vincent Verboven
 * 16/11/2022
 */
public enum Merk {
    ACER,APPLE,ASUS,DELL,HP,LENOVO,MEDION,TOSHIBA;

    @Override
    public String toString() {
        return name().toUpperCase().charAt(0) + name().substring(1).replace('_', ' ').toLowerCase();
    }
}
