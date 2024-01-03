package lt.pd6_11;
import java.util.*;
public class Main6_11 {
    public static void main(String[] args) {
        int[] myArray = {1, 6, 5, 9, 11, 2, 6};

        Arrays.sort(myArray);

        System.out.println("full sorted array: " + Arrays.toString(myArray));
        System.out.println("3rd smallest: " + myArray[2]);


    }
}
