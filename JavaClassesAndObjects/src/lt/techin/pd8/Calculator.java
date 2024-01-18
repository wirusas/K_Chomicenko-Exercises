package lt.techin.pd8;

public class Calculator {
    private double num1;
    private double num2;
    private String operator;


    public String myCalculator(int num1, int num2, String operator) {
        double result = 0;
        String returnString = "";

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
                if (num2 == 0) {
                    returnString = "Division by 0 not possible";

                } else {
                    result = num1 / num2;
                    returnString = num1 + " / " + num2 + " equals " + result;
                }
                break;
            case "*":
                result = num1 * num2;
                returnString = num1 + " * " + num2 + " equals " + result;
                break;

            case "%":
                if (num2 == 0 || num1 == 0) {
                    returnString = "do not enter ZERO";
                } else {
                    result = num1 / num2 * 100;
                    returnString = num1 + " of " + num2 + " equals " + result + " %";
                }
                break;

            default:
                System.out.println("wrong operator");
        }


        return returnString;
    }

    public String myCalculator(double num1, String operator) {
        double result = 0;
        String returnString = "";

        switch (operator) {


            case "sin":
                result = Math.sin(num1);
                returnString = " sin " + num1 + " equals " + result;
                break;


            default:
                System.out.println("wrong operator");
        }


        return returnString;
    }
}
