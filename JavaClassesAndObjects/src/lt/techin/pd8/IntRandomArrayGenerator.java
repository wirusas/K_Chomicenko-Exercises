package lt.techin.pd8;

import java.util.Random;

public class IntRandomArrayGenerator {

    public int[] generateRandom(int size){
        Random random = new Random();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++){
            randomNumbers[i] = random.nextInt(11);

        }

        return randomNumbers;
    }
}
