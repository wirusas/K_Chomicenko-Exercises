package lt.pd6_15;

import java.util.*;

public class Main6_15 {
    public static void main(String[] args) {
        int[] myIntArray = {3, 9, 5, -10, -6, -20, -100};

        //FINDING SUM OF ARRAY ELEMENTS
        int arraySum = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            arraySum += myIntArray[i];
        }
        //FINDING ARRAYS AVERAGE
        float arrayAverage = (float) arraySum / myIntArray.length;

        float lowestDiff = Math.abs(arrayAverage - myIntArray[0]);
        int closesttNumber = myIntArray[0];

        for (int i = 0; i < myIntArray.length; i++) {
            if (Math.abs(arrayAverage - myIntArray[i]) < lowestDiff) {
                lowestDiff = Math.abs(arrayAverage - myIntArray[i]);
                closesttNumber = myIntArray[i];
            }
        }
        System.out.println("array average = " + arrayAverage);
        System.out.println("closest array number to average is number: " + closesttNumber);
    }
}
