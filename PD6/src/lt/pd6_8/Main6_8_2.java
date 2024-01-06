package lt.pd6_8;

import java.util.Arrays;

public class Main6_8_2 {
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

        String[] arrayTemp = new String[myArray.length];
        int arrayLength = 0;

        for (int i = 0; i < myArray.length; i++) {
            int count = 0;
            for (int j = i+1; j < myArray.length; j++) {
                if (myArray[j].equalsIgnoreCase(myArray[i])) {
                    count++;
                }
            }
            if (count == 0) {
                arrayTemp[arrayLength] = myArray[i];
                arrayLength++;
            }
        }
        String [] array3 = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array3[i] = arrayTemp[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
