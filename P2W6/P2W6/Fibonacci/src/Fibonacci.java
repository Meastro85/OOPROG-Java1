import java.lang.module.FindException;

/**
 * Vincent Verboven
 * 19/12/2022
 */
public class Fibonacci {
    private static final long MAX = 91;

    public static long finonacciGetal(int n) throws FibonacciException{
        long getal = 0;
            checkInt(n);

            long eerste = 0;
            long tweede = 1;


            for (int i = 0; i < n; i++) {
                getal = eerste + tweede;
                eerste = tweede;
                tweede = getal;

            }
            return getal;

    }

    static void checkInt(int n) throws FibonacciException {
        if (n < 0) {
            throw new FibonacciException("Negatieve waarden zijn uitgesloten!");
        } else if (n > MAX) {
            throw new FibonacciException("De maximale waarde voor type long is overschreden");
        }
    }
}
