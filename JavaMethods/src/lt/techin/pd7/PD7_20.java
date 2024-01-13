/**
 * Naudojant Java metodus, parašykite paprasčiausią Java programą ”Atspėk skaičių”.
 */

package lt.techin.pd7;

import java.util.Random;
import java.util.Scanner;

public class PD7_20 {
    public static void main(String[] args) {
        guesTheNumber();
        // TODO
    }

    public static void guesTheNumber() {
        Random random = new Random();
        int numbRand = random.nextInt(11);
        int usersNumber = -1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gues the number from 0 to 10");
            usersNumber = Integer.parseInt(scanner.nextLine());
        } while (numbRand != usersNumber);
        if (numbRand == usersNumber) {
            System.out.println("you are right my number was: " + numbRand);
        }
    }
}
