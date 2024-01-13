/**
 * Parašykite Java metodą, kuris patikrina ar skaičius yra pirminis, ar ne.
 */

package lt.techin.pd7;

public class PD7_12 {
    public static void main(String[] args) {
        int number = 156781;
        boolean isPrimeNumber = isPrime(number);
        System.out.println("METHOD 1: " + isPrimeNumber);

        boolean isPrime2 = isPrime2(number);
        System.out.println("METHOD 2:  " + isPrime2);
        // TODO
    }

    //METHOD 1
    private static boolean isPrime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number <= 1 || number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        for (int i = 5; i * i < number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    //METHOD 2
    public static boolean isPrime2(int number) {
        boolean myBool = true;
        int divCounter = 0;
       if(number == 2)
           myBool = true;
        if (number <= 1) {
            myBool = false;
        } else {
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    divCounter++;
                }
            }
            if (divCounter > 1) {
                myBool = false;
            }
        }
        return myBool;
    }

}
