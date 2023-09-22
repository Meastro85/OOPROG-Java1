/**
 * Vincent Verboven
 * 16/11/2022
 */
public enum CpuType {
    I3,I5,I7;

    @Override
    public String toString() {
        return name().toUpperCase().charAt(0) + name().substring(1).replace('_', ' ').toLowerCase();
    }
}
