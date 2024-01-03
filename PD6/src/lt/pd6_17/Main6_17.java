package lt.pd6_17;

import java.util.*;

public class Main6_17 {
    public static void main(String[] args) {

        int[] myArray = {10, -5, 5, 12, 11, 9, 6, 4, 100, 1000, 1001, -100};
        System.out.println("Original array\n" + Arrays.toString(myArray));
        int newArrayLength = 0;

        for (int i = 0; i < myArray.length; i++){
            if(myArray[i] % 2 == 0){
                newArrayLength++;
            }
        }
        int[] newArray = new int[newArrayLength];

        for (int i = 0; i < myArray.length; i++){
            if(myArray[i] % 2 == 0){
                newArray[newArrayLength-1] = myArray[i];
                newArrayLength--;
            }
        }
        System.out.println("\n filtered array even numbers only\n" + Arrays.toString(newArray));

    }
}
