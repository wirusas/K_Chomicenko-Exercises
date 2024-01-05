package lt.pd6_18;

import java.util.Arrays;

public class Main6_18_2 {
    public static void main(String[] args) {
        int[] array1 = {23, 45, 12, 3, 78, 98, 15, -3};
        int[] array2 = {2, 12, 24, 15, 48, 64, -5, 65};
        int[] arrayTemp = new int[array1.length + array2.length];
        int arrayLength = 0;

        for (int i = 0; i < array2.length; i++) {
            int count = 0;
            for (int j = 0; j < array1.length; j++) {

                if (array1[j] == array2[i]) {
                    count++;
                }
            }
            if (count == 0) {
                arrayTemp[arrayLength] = array2[i];
                arrayLength++;
            }
        }
        int[] array3 = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array3[i] = arrayTemp[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
