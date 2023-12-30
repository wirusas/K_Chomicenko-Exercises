package lt.pd5_8;

import java.util.Scanner;

public class Main5_8 {
    public static void main(String[] args) {
        int dienuSkaicius = 0;
        int bakoTalpa = 0;
        int sanaudosLyginemDienom = 0;
        int daysCounter = 0;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Įveskite kuro bako talpą litrais ");
        bakoTalpa = Integer.parseInt(scanner1.nextLine());

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Įveskite kuro sąnaudas litrais lyginėmis dienomis ");
        sanaudosLyginemDienom = Integer.parseInt(scanner2.nextLine());

        int i = 2;
        while (bakoTalpa >= sanaudosLyginemDienom) {
            if (i % 2 == 0) {
                bakoTalpa -= sanaudosLyginemDienom;

            } else if (bakoTalpa >= sanaudosLyginemDienom * 2) {
                bakoTalpa -= sanaudosLyginemDienom * 2;
            }
            i++;
            daysCounter++;
        }
        System.out.print("Keliauti bus galima " + daysCounter + " dienas");
    }
}
