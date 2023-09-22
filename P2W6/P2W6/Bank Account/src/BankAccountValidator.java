/**
 * Vincent Verboven
 * 19/12/2022
 */
public class BankAccountValidator {
    public static boolean isValidBelgianIban(String iban){
        if(iban.matches("BE[0-9]{14}")){
            try {
                String landcode = iban.substring(0, 2);
                int controleGetal = Integer.parseInt(iban.substring(2, 4));
                int bankCode = Integer.parseInt(iban.substring(4, 7));
                int rekeningnummer = Integer.parseInt(iban.substring(7, 14));
                int nationaalControleGetal = Integer.parseInt(iban.substring(14, 16));

                if(nationaalControleGetal != (bankCode * 10000000L + rekeningnummer)%97){
                    return false;
                }
                if(controleGetal < 2 || controleGetal > 98){
                    return false;
                }
                return true;
            }catch (Exception e){
                e.printStackTrace();
                return false;
            }

        }
        return false;
    }
}
