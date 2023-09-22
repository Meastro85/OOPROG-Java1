/**
 * Vincent Verboven
 * 24/11/2022
 */
public class Student {

    private String naam;
    private int nummer;

    public Student(String naam, int nummer){
        this.naam = naam;
        this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public int getNummer() {
        return nummer;
    }

    @Override
    public int hashCode() {
        return nummer;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}
