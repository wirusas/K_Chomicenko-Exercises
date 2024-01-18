package lt.techin.pd8;

import java.util.Random;

public class DoubleRandomArrayGen {
   public double[] doubleRandArray(int arrayLength){
       Random random = new Random();

       double[] newArray = new double[arrayLength];
       for (int i = 0; i < arrayLength; i++){
           double doubleRandom = random.nextDouble();
           int intRandom = random.nextInt(101);
           newArray[i] = doubleRandom * intRandom;
       }
       return newArray;
    }

}
