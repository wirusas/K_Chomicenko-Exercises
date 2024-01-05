package lt.pd6_10;

import java.util.Arrays;

public class Main6_10_3 {
    public static void main(String[] args) {
        int[] array1 = {2, 2, 5, 6, 9, 15, 15};
        int[] array2 = {2, 4, 9, 11};
        int[] arrayJoined = new int[array1.length + array2.length];

        for (int i = 0; i < (array1.length + array2.length); i++) {
            if (i < array1.length) {
                arrayJoined[i] = array1[i];
            } else {
                arrayJoined[i] = array2[i - array1.length];
            }
        }

        int arrayIndex = 0;
        int[] temArray = new int[arrayJoined.length];

        for (int i = 0; i < arrayJoined.length; i++) {
            int conter = 0;
            for (int j = i + 1; j < arrayJoined.length; j++) {
                if (arrayJoined[i] == arrayJoined[j]) {
                    conter++;
                }
            }
            if (conter == 0) {
                temArray[arrayIndex] = arrayJoined[i];
                arrayIndex++;
            }
        }
        arrayJoined = new int[arrayIndex];
        for (int i = 0; i < arrayIndex; i++) {
            arrayJoined[i] = temArray[i];
        }
        System.out.println(Arrays.toString(arrayJoined));
    }
}
