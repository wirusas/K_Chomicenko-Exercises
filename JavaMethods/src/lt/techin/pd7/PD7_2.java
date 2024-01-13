/**
 * Parašykite Java metodą, kuris konvertuoja Celsijaus laipsnius į Farenheitą.
 */

package lt.techin.pd7;

public class PD7_2 {
    public static void main(String[] args) {
        double fahrenheith = celciusToFahrenheit(25);
        System.out.println(fahrenheith);

    }

    public static double celciusToFahrenheit(double cecius) {
        return cecius * 9 / 5 + 32;

    }
}
