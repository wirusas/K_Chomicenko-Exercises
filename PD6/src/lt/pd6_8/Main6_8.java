package lt.pd6_8;

import java.util.*;

public class Main6_8 {
    public static void main(String[] args) {
        String myArray[] = new String[10];
        myArray[0] = "pirmas";
        myArray[1] = "antras";
        myArray[2] = "Trečias";
        myArray[3] = "pirmas";
        myArray[4] = "Antras";
        myArray[5] = "pirmas";
        myArray[6] = "KETVIRTAS";
        myArray[7] = "9";
        myArray[8] = "penkiolika";
        myArray[9] = "9";



        int countEquals = 0;
        System.out.println("Original array\n" + Arrays.toString(myArray) + "\n");

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] == myArray[i]) {
                    myArray[i] = "";
                    countEquals++;
                }
            }
        }
        int newArrayLength = myArray.length - countEquals;
        String[] tempArray = new String[newArrayLength];

        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != "") {
                tempArray[j] = myArray[i];
                j++;
            }
        }
        System.out.println("Temp array\n" + Arrays.toString(tempArray));
        myArray = tempArray;
        System.out.println("\nMy array final\n" + Arrays.toString(myArray));


    }
}
