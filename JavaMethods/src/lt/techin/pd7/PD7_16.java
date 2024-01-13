/**
 * Parašykite Java metodą, kuris patikrina ar skaičius yra tobulasis.
 */

package lt.techin.pd7;

public class PD7_16 {
    public static void main(String[] args) {
        // TODO
        System.out.println(perfectNumber(8128));
    }

    public static boolean perfectNumber(int numberToCheck) {
        int sumOfDivided = 0;
        for (int i = 1; i <= numberToCheck / 2; i++) {
            if (numberToCheck % i == 0) {
                sumOfDivided += i;
            }
        }
        if (sumOfDivided == numberToCheck) {
            return true;
        }
        return false;
    }
}
