/**
 * Sukurkite klasę / objektą kuris moka generuoti atsitiktinių skaičių masyvą. Masyvo dydis yra
 * pateikiamas kaip argumentas.
 */

package lt.techin.pd8;

import java.util.ArrayList;
import java.util.Arrays;

public class PD8_1 {
    public static void main(String[] args) {

        DoubleRandomArrayGen doubleRandomArrayGen = new DoubleRandomArrayGen();
        double[] myArray1 = doubleRandomArrayGen.doubleRandArray(5);
        System.out.println();
        System.out.println(Arrays.toString(myArray1));
        // TODO
        IntRandomArrayGenerator intRandomArrayGenerator = new IntRandomArrayGenerator();

        int[] myArray2 = intRandomArrayGenerator.generateRandom(10);
        System.out.println(Arrays.toString(myArray2));
    }
}
