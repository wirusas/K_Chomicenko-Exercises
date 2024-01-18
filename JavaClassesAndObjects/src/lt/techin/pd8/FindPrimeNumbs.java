package lt.techin.pd8;

public class FindPrimeNumbs {
    String result;

    public int[] PrimeFinder(int num1, int num2, int num3, int num4, int num5, int num6) {

        System.out.println("\nPrime numbers from your input are:\n");

        int[] intArray = {num1, num2, num3, num4, num5, num6};
        int[] tempArray = new int[6];

        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] < 1) {
            }
            if (intArray[i] == 2 || intArray[i] == 3) {
                tempArray[i] = intArray[i];

            } else if (intArray[i] > 4) {
                int counter = 0;
                for (int j = 2; j <= intArray[i] / 2; j++) {
                    if (intArray[i] % j == 0) {
                        counter++;
                    }
                    if (counter == 0) {
                        tempArray[i] = intArray[i];
                    }
                }
            }
        }

        return tempArray;
    }

}
