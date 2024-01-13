/**
 * Parašykite Java metodą, kuris skaičiuoja skaičiaus faktorialą.
 */

package lt.techin.pd7;

import java.math.BigInteger;

public class PD7_5 {
    public static void main(String[] args) {
        // TODO
        int number = 6;
        System.out.println("METHOD 1: " + countFactorial(number));
        System.out.println("METHOD 2: " + counFactorial2(number));
    }

    //METHOD 1
    public static BigInteger countFactorial(int number) {
        if (number < 0) {
            return BigInteger.ZERO;
        } else {
            BigInteger factorial = BigInteger.ONE;
            for (int i = 1; i <= number; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
        }
    }

    //METHOD 2
    public static BigInteger counFactorial2(int number) {
        BigInteger factorial = BigInteger.ONE;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
        } else {
            return BigInteger.ZERO;
        }

    }
}
