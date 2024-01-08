package lt.pd6_5;

import java.util.*;

public class Main6_5 {
    public static void main(String[] args) {

        int[] ages = {5, 7, 5, 6, 8, 10, 12, 0, 1, 30, -5};

        //METHOD 1
        System.out.println("METHOD 1");
        int minNumber = ages[0];
        int maxNumber = ages[0];

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < minNumber) {
                minNumber = ages[i];
            }
            if (ages[i] > minNumber) {
                maxNumber = ages[i];
            }
        }
        System.out.println("min array number is: " + minNumber);
        System.out.println("max array number is: " + maxNumber + "\n");

        //METHOD 2
        System.out.println("METHOD 2");
        int maxValue = Arrays.stream(ages).max().getAsInt();
        System.out.println("max: " + maxValue);
        int minValue = Arrays.stream(ages).min().getAsInt();
        System.out.println("min: " + minValue + "\n");

        //METHOD 3
        System.out.println("METHOD 3");
        Arrays.sort(ages);
        System.out.println("min number: " + ages[0]);
        System.out.println("max number: " + ages[ages.length - 1] + "\n");
    }
}
