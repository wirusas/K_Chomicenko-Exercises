/**
 * Parašykite Java metodą, kuris grąžina pateikto masyvo elementus, didesnius už nurodytą skaičių.
 */

package lt.techin.pd7;

public class PD7_17 {
    public static void main(String[] args) {
        // TODO
        int[] myArray = {1, 5, 9, 25, 2, 3, 36};
        int numberToCompare = 1;
        bigerThanNumber(myArray, numberToCompare);
    }

    public static void bigerThanNumber (int[] arrayOfIntegers, int intTocompare){
        System.out.println("Number biger than " + intTocompare + "are\n");

        for (int i = 0; i < arrayOfIntegers.length; i++){
            if (arrayOfIntegers[i] > intTocompare){
                System.out.print(" " + arrayOfIntegers[i]);
            }
        }
    }
}
