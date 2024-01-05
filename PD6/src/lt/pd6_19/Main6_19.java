package lt.pd6_19;

import java.util.Arrays;

public class Main6_19 {
    public static void main(String[] args) {
        int[] myArray = {1, 45, 1, 3, 3, 98, 15, -3, -3, 1};
        int arrayIndex = 0;
        int[] tempArray = new int[myArray.length];

        for (int i = 0; i < myArray.length - 1; i++) {
            int count = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    count++;
                }
            }
            if (count == 1) {
                tempArray[arrayIndex] = myArray[i];
                arrayIndex++;
            }
        }
        int[] newArray = new int[arrayIndex];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = tempArray[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
