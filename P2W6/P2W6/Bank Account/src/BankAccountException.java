import java.text.ParseException;

/**
 * Vincent Verboven
 * 19/12/2022
 */
public class BankAccountException extends ParseException {
    public BankAccountException(String s, int errorOffset) {
        super(s, errorOffset);
    }
}
