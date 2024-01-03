package lt.pd6_10;

import java.util.*;

public class Main6_10_2 {
    public static void main(String[] args) {
        int[] array1 = {2, 2, 5, 6, 9, 15, 15, 15, 15};
        int[] array2 = {2, 4, 9, 11};
        int[] arrayJoined = new int[array1.length + array2.length];

        //JOIN ARRAYS
        System.arraycopy(array1, 0, arrayJoined, 0, array1.length);
        System.arraycopy(array2, 0, arrayJoined, array1.length, array2.length);

        Arrays.sort(arrayJoined);
        System.out.println("joined array\n" + Arrays.toString(arrayJoined));

        int tempArrayLength = 1;
        for (int i = 0; i < arrayJoined.length - 1; i++) {
            if (arrayJoined[i] != arrayJoined[i + 1]) {
                tempArrayLength++;
            }
        }

        int[] tempArray = new int[tempArrayLength];
        int j = 0;

        for (int i = 0; i < arrayJoined.length - 1; i++) {
            if (arrayJoined[i] != arrayJoined[i + 1]) {
                tempArray[j++] = arrayJoined[i];
            }
        }
        tempArray[j] = arrayJoined[arrayJoined.length - 1];
        System.out.println("\narray no duplicates\n" + Arrays.toString(tempArray));
    }
}

