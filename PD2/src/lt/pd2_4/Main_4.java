package lt.pd2_4;

import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) {
        Scanner userName = new Scanner((System.in));  //Create a Scanner object
        System.out.println(("Enter your name"));

        String userWelcome = userName.nextLine(); //Read user input
        System.out.println("Sveiki, " + userWelcome + "!");
    }
}
