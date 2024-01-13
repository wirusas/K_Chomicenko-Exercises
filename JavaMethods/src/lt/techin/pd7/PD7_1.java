/**
 * Parašykite Java metodą, kuris grąžina skaičiaus kvadratą.
 */

package lt.techin.pd7;

public class PD7_1 {
    public static void main(String[] args) {
        int square1 = intSqureCalc1(7);
        System.out.println("Square calc method 1 square: " + square1);

        double square2 = doubleSqureCalc2(2.5);
        System.out.println("\nSquuare calc method 2 square: " + square2);
    }

    //METHOD 1
    public static int intSqureCalc1(int number) {
        return number * number;
    }

    //METHOD 2
    public static double doubleSqureCalc2(double number) {
        return Math.pow(number, 2);
    }
}
