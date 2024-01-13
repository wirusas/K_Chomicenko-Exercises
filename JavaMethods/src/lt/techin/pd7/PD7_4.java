/**
 * Parašykite Java metodą, kuris skaičiuoja dviejų skaičių didžiausią bendrą daliklį.
 */

package lt.techin.pd7;

public class PD7_4 {
    public static void main(String[] args) {
        // TODO
        int num1 = 480;
        int num2 = 34;

        int gcd = findGreatComDivider(num1, num2);
        System.out.println("METHOD 1: " + gcd);

        int gcd2 = findGreatdiv2(num1, num2);
        System.out.println("METHOD 2: " + gcd2);
    }

    //METHOD 1
    public static int findGreatComDivider(int number1, int number2) {
        while (number2 != 0) {
            int tmp = number2;
            number2 = number1 % number2;
            number1 = tmp;
        }

        return number1;
    }

    //METHOD 2
    public static int findGreatdiv2(int num1, int num2) {
        int i = num1;

        do {
            int temp1 = num2 % i;
            int temp2 = num1 % i;
            i--;
            if (temp1 == 0 && temp2 == 0) {
                return i + 1;

            }

        } while (num1 != 0);
        return i;
    }
}
