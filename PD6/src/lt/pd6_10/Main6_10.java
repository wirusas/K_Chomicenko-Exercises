package lt.pd6_10;

import java.util.*;

public class Main6_10 {
    public static void main(String[] args) {
        int[] array1 = {2, 2, 5, 6, 9, 15};
        int[] array2 = {2, 4, 9, 11};
        int[] arrayJoined = new int[array1.length + array2.length];

        //JOIN ARRAYS
        System.arraycopy(array1, 0, arrayJoined, 0, array1.length);
        System.arraycopy(array2, 0, arrayJoined, array1.length, array2.length);

        Arrays.sort(arrayJoined);
        System.out.println("joined arrays\n" + Arrays.toString(arrayJoined));


        int countEquals = 0;

        for (int i = 0; i < arrayJoined.length; i++) {
            for (int j = i + 1; j < arrayJoined.length; j++) {
                if (arrayJoined[j] == arrayJoined[i]) {
                    arrayJoined[i] = 0000000;
                    countEquals++;
                }
            }
        }
        int newArrayLength = arrayJoined.length - countEquals;
        int[] tempArray = new int[newArrayLength];

        int j = 0;
        for (int i = 0; i < arrayJoined.length; i++) {
            if (arrayJoined[i] != 00000000) {
                tempArray[j] = arrayJoined[i];
                j++;
            }
        }
        System.out.println("Temp array\n" + Arrays.toString(tempArray));
        arrayJoined = tempArray;
        System.out.println("\nMy array final\n" + Arrays.toString(arrayJoined));
    }
}
