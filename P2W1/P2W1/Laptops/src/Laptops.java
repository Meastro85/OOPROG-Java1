/**
 * Vincent Verboven
 * 16/11/2022
 */
public class Laptops {
    private Laptop[] laptops;
    private int aantal;

    public Laptops(){
        this.laptops = new Laptop[2000];
        this.aantal = 0;
    }

    public void voegToe(Laptop laptop){
        this.laptops[aantal] = laptop;
        aantal++;
    }

    public int getAantal() {
        return aantal;
    }

    public Laptop getLaptop(int index){
        return this.laptops[index];
    }

}
