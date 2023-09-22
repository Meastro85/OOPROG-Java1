/**
 * Vincent Verboven
 * 16/11/2022
 */
public class Laptop {
    private String eigenaar;
    private CpuGeneration cpuGeneration;
    private CpuType cpuType;
    private int ram;
    private int disk;
    private Merk merk;

    public Laptop(String eigenaar, CpuGeneration cpuGeneration, CpuType cpuType, int ram, int disk, Merk merk){
        this.eigenaar = eigenaar;
        this.cpuGeneration = cpuGeneration;
        this.cpuType = cpuType;
        this.ram = ram;
        this.disk = disk;
        this.merk = merk;
    }

    public String getEigenaar() {
        return eigenaar;
    }

    public CpuGeneration getCpuGeneration() {
        return cpuGeneration;
    }

    public CpuType getCpuType() {
        return cpuType;
    }

    public int getRam() {
        return ram;
    }

    public int getDisk() {
        return disk;
    }

    public Merk getMerk() {
        return merk;
    }

    @Override
    public String toString() {
        return String.format("Laptop van %s: %s (%s %s), %dGB, %dGB ", this.eigenaar == null ? "onbekende eigenaar" : this.eigenaar
                , this.merk == null ? "onbekend merk" : this.merk , this.cpuType== null ? "onbekend type" : this.cpuType,
                this.cpuGeneration == null ? "onbekende generatie" : this.cpuGeneration,
                this.ram, this.disk);
    }
}
