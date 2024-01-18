/**
 * Sukurkite klasę / objektą kuris moka rasti visus pirminius skaičius pateiktame skaičių diapazone.
 */

package lt.techin.pd8;

import java.util.Arrays;

public class PD8_2 {
    public static void main(String[] args) {
        // TODO
        FindPrimeNumbs findPrimeNumbs = new FindPrimeNumbs();
        int[] primeArray = findPrimeNumbs.PrimeFinder(12, 18, 113, 10000, 40, 23);
        System.out.println(Arrays.toString(primeArray));
    }
}
