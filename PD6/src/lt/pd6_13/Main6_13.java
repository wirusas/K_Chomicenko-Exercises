package lt.pd6_13;

import java.util.*;

public class Main6_13 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 9, 6, 4};
        int[] array2 = {9, 6, 4, 1, 2, 3, 5};
        boolean myBoolean = true;
        Arrays.sort(array1);
        Arrays.sort(array2);


        if (array1.length != array2.length) {
            myBoolean = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    myBoolean = false;
                    break;
                }
            }
        }
        if (myBoolean) {
            System.out.println("masyvai vienodi");
        } else {
            System.out.println("masyvai skirtingi");
        }
    }
}
