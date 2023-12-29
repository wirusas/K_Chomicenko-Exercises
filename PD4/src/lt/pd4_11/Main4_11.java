package lt.pd4_11;

import java.util.Scanner;

public class Main4_11 {
    public static void main(String[] args) {
        int currentNumberOfFishes = 0;
        int fishesAddedPerDay = 0;
        int daysPassed = 0;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Kiek žuvų gyvena akvariume? ");
        currentNumberOfFishes = Integer.parseInt(scanner1.nextLine());

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Kiek žuvų į akvariumą įdedama keikvieną dieną ? ");
        fishesAddedPerDay = Integer.parseInt(scanner2.nextLine());

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Kiek dienų praėjo ? ");
        daysPassed = Integer.parseInt(scanner3.nextLine());

        System.out.println("Po trijų dienų akvariume gyvens " + (currentNumberOfFishes + fishesAddedPerDay * daysPassed) + " žuvų");

    }
}
