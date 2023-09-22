/**
 * Vincent Verboven
 * 19/12/2022
 */
public class BankAccount {
    private String iban;

    public BankAccount(String iban) throws BankAccountException{
            checkIban(iban);
            this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder(iban);
        for (int i = 0; i < iban.length(); i++){
            if(i+1 % 4 == 0){
                string.insert(i," ");
            }
        }
        return string.toString();
    }
    static void checkIban(String iban) throws BankAccountException{
        if (!BankAccountValidator.isValidBelgianIban(iban)){
            throw new BankAccountException("Fout banknummer!", 0);
        }
    }
}
