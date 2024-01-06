package lt.pd6_8;

import java.util.Arrays;

public class Main6_8_3 {
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
        String[] tempString = new String[myArray.length];
        int arrayIndex = 0;
        for (int i = 0; i < myArray.length; i++) {
            int count = 0;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j].equalsIgnoreCase(myArray[i])) {
                    count++;
                }
            }
            if (count == 0) {
                tempString[arrayIndex] = myArray[i];
                arrayIndex++;
            }
        }
        myArray = new String[arrayIndex];
        for (int i = 0; i < arrayIndex; i++) {
            myArray[i] = tempString[i];
        }
        System.out.println(Arrays.toString(myArray));
    }
}
