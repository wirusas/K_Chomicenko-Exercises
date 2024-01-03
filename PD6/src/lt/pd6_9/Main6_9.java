package lt.pd6_9;

import java.util.*;

public class Main6_9 {


    public static void main(String[] args) {
      String[] myArray = {"1", "2", "3", "4", "penki"};

      List list = Arrays.asList(myArray);

      Collections.shuffle(list);
      list.toArray(myArray);

        System.out.println(Arrays.toString(myArray));


    }
}
