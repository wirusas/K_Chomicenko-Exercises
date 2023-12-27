package lt.pd4_9;

import java.util.Scanner;

public class New4_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek puodelių norite supakuoti? ");
        int cups = Integer.parseInt(scanner.nextLine());

        System.out.println("Pilnų dėžučių skaičius  " + cups / 3);
        System.out.println("Nesupakuotų puodėlių skaičius " + cups % 3);
    }
}
