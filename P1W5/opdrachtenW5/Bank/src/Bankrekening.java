/**
 * Vincent Verboven
 * 17/10/2022
 */
public class Bankrekening {
    private String houder;
    private String iban;
    private double saldo;
    public Bankrekening(String houder, String iban, double saldo){
        this.houder = houder;
        this.iban = iban;
        this.saldo = saldo;
    }

    public Bankrekening(String houder, String iban){
        this(houder,iban,0);
    }

    public String getHouder(){
        return this.houder;
    }

    public String getIban(){
        return this.iban;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void storting(int verhoging){
        if(verhoging > 0 ) this.saldo += verhoging;
    }

    public boolean opname(int verlaging){
        boolean opname;
        if((this.saldo - verlaging) < 0) {
            opname = false;
        } else {
            this.saldo -= verlaging;
            opname = true;
        }
        return opname;
    }

    public String toString(){
        return "De rekening " + this.iban + " op naam van " + this.houder + " heeft een saldo van €" + saldo;
    }

}
