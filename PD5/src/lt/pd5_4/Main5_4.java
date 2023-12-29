package lt.pd5_4;

import java.util.Scanner;

public class Main5_4 {
    public static void main(String[] args) {
        System.out.println("Veskite skaičius, o aš jums pateiksiu jų sumą.\n Norėdami baigti operaciją įveskite 0");
        int sumOfInputs = 0;
        int usersNumber;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Jūsų skaičius?");

            usersNumber = Integer.parseInt(scanner.nextLine());
            sumOfInputs += usersNumber;

            System.out.println("suvestų skaičių suma lygi " + sumOfInputs);
        } while (usersNumber != 0);

    }
}
