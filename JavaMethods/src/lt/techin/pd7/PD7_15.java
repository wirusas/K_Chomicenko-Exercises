/**
 * Parašykite Java metodą, kuris skaičių masyve suranda antrąjį mažiausią ir antrąjį didžiausius skaičius.
 */

package lt.techin.pd7;

import java.util.Arrays;

public class PD7_15 {
    public static void main(String[] args) {
        int[] myArray = {1, 6, 5, 9, 7, 25, 23};
        System.out.println(secondLowestBigestNo(myArray));

        // TODO
    }

    public static String secondLowestBigestNo(int[] usersArray) {
        int secondBiggest;
        int secondLowest;
        Arrays.sort(usersArray);
secondLowest = usersArray[1];
secondBiggest = usersArray[usersArray.length-2];
        return "Second Lowest is " + secondLowest + "\nSecond Bigest is " + secondBiggest ;

    }
}
