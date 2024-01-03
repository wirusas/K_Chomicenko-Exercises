package lt.pd6_12;

public class Main6_12 {
    public static void main(String[] args) {
     int[] myArray = {1, -1, 3, 4, -5, 6, -10, -999};
     int negativesCount = 0;

     for(int i = 0; i < myArray.length; i++){
         if(myArray[i] < 0){
             negativesCount++;
         }

     }
        System.out.println("there are " + negativesCount + " negative numbers in the array");

    }
}
