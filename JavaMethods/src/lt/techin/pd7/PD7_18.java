/**
 * Naudojant Java metodus, parašykite paprasčiausią Java programą ”Matematinis skaičiuotuvas”.
 */

package lt.techin.pd7;

public class PD7_18 {
    public static void main(String[] args) {
        // TODO
        int num1 = 10;
        int num2 = 0;

        System.out.println(simpleCalculator(num1, num2, "/"));
    }

    public static String simpleCalculator(int num1, int num2, String operator) {
        int result = 0;
        String returnString = "";
        if (num2 == 0) {
            returnString = "Division by \"0\" is not allowed";
        } else {
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    returnString = num1 + " + " + num2 + " equals " + result;
                    break;
                case "-":
                    result = num1 - num2;
                    returnString = num1 + " - " + num2 + " equals " + result;
                    break;
                case "/":
                    result = num1 / num2;
                    returnString = num1 + " / " + num2 + " equals " + result;
                    break;
                case "*":
                    result = num1 * num2;
                    returnString = num1 + " * " + num2 + " equals " + result;
                    break;
                default:
                    System.out.println("wrong operator");
            }
        }

        return returnString;
    }
}
