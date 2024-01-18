/**
 * Sukurkite paprastą komandinės eilutės (angl. command line interface (CLI)) skaičiuotuvą. Rei-
 * kalavimai skaičiuotuvui:
 * Aritmetinės operacijos: +, -, *, /
 * Sinuso, kosinuso ir tangento funkcijų skaičiavimas: sin(x), cos(x), tg(x)
 * Procentų skaičiavimas: %
 * Kvadratinės šaknies skaičiavimas: x
 * Skaičiaus kėlimas bet kokiu laipsniu: x^y
 */

package lt.techin.pd8;

public class PD8_6 {
    public static void main(String[] args) {
        // TODO

        Calculator calculator = new Calculator();
String result = calculator.myCalculator(10, 0, "%");

        System.out.println(result);

        String sinCalc = calculator.myCalculator(600, "sin");
        System.out.println(sinCalc);
    }


}
