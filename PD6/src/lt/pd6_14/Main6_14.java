package lt.pd6_14;

import java.util.*;

public class Main6_14 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 9, 6, 4};
        int[] array2 = {9, 6, 4, 1, 2, 10};
        Arrays.sort(array1);
        Arrays.sort(array2);
        int contEquals = 0;
//        int arrayLength = Math.min(array1.length, array2.length);

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    contEquals++;
            }
        }
        System.out.println("Masyvai turi: " + contEquals + " vienodus(ų) elementų");
    }
}
