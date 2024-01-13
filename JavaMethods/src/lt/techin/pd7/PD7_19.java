/**
 * Naudojant Java metodus, parašykite paprasčiausią Java programą ”Kūno masės indeksas”.
 */

package lt.techin.pd7;

public class PD7_19 {
    public static void main(String[] args) {

        // TODO
        double weight = 75;
        double height = 180;
        System.out.println("your BMI is: " + calcBMI(weight, height));
    }

    public static double calcBMI(double weight, double heightCM) {
        double yourBMI = Math.floor((weight / Math.pow(heightCM / 100, 2)) * 100) / 100;

        return yourBMI;
    }
}
