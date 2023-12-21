package lt.pd2_5;

import java.util.Scanner;

/*JAVA CLASS DEFINED */
public class Main_5 {

    public static void main(String[] args) {
        /*PROGRAM WILL ASK AN INPUT FROM USER*/
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter random number"); //HERE IS WHAT USER WILL SEE

        /*USERS INPUT WILL BE ASSIGNED TO VARIABLE MULTIPLIER*/
        int multiplier = Integer.parseInt(userInput.nextLine());

        System.out.println("your square number is " + multiplier * multiplier); //PROGRAM WILL SQUARE ENTERED NUMBER

    }


}
