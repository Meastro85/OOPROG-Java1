/**
 * Vincent Verboven
 * 24/11/2022
 */
public class Lid {

    private String naam;
    private long nummer;

    public Lid(String naam, long nummer){
        this.naam = naam;
        this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public long getNummer() {
        return nummer;
    }

    @Override
    public String toString() {
        return naam;
    }

    @Override
    public int hashCode() {
        return (int) nummer;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

}
