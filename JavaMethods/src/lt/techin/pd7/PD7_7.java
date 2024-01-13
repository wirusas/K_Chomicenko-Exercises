/**
 * Parašykite Java metodą, kuris apverčia skaičių (Pvz.: 45 –> 54).
 */

package lt.techin.pd7;

import java.util.Arrays;

public class PD7_7 {
    public static void main(String[] args) {
        int number = 500;
        System.out.println("METHOD 1 = " + reversedNumber(number));

        System.out.println("METHOD 2 = " + reversedNumber2(number));

        System.out.println("METHOD 3 returns as a string  = " + reversedNumber3(number));
    }

    //METHOD 1
    public static int reversedNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int reminder = number % 10;
            reversed = reversed * 10 + reminder;
            number = number / 10;
        }
        return reversed;
    }

    //METHOD 2
    public static int reversedNumber2(int number) {
        String reversedNum = "";
        Integer tempNum = number;
        String tempString = tempNum.toString();
        char[] tempArray = tempString.toCharArray();
        for (int i = tempArray.length - 1; i >= 0; i--) {
            reversedNum += tempArray[i];
        }
        return Integer.parseInt(reversedNum);
    }

    //METHOD 3
    public static String reversedNumber3(int number) {
        String reversedNum = "";
        Integer tempNum = number;
        String tempString = tempNum.toString();
        char[] tempArray = tempString.toCharArray();
        for (int i = tempArray.length - 1; i >= 0; i--) {
            reversedNum += tempArray[i];
        }
        return reversedNum;
    }
}

// 102 = 201