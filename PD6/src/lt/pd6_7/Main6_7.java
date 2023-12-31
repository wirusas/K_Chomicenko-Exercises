package lt.pd6_7;

public class Main6_7 {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3, 4, 5};
        int sumOfMyNumbers = 0;
        int multiOfMyNumbers = 1;

        for (int i = 0; i < myNumbers.length; i++) {
        sumOfMyNumbers += myNumbers[i];
        multiOfMyNumbers *= myNumbers[i];

        }
        System.out.println("Sum of array elements is: " + sumOfMyNumbers);
        System.out.println("Multiplication of array elements is: " + multiOfMyNumbers);
    }
}
