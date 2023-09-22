/**
 * Vincent Verboven
 * 16/11/2022
 */
public enum CpuGeneration {
    SANDY_BRIDGE, IVY_BRIDGE, HASWELL, BROADWELL, SKYLAKE, KABYLAKE;

    @Override
    public String toString() {
        return name().toUpperCase().charAt(0) + name().substring(1).replace('_', ' ').toLowerCase();
    }
}
