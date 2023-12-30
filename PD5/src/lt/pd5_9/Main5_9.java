package lt.pd5_9;

import java.util.Scanner;

public class Main5_9 {
    public static void main(String[] args) {

        int ammountOfBussesLess10 = 0;
        float drivingTimeTotal = 0F;
        float drivingTimeaverage = 0F;
        int minutesPerHour = 60;
        int passengersTotal = 0;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Kiek autobusų vyksta kasdien? ");
        int ammountOfBusses = Integer.parseInt(scanner1.nextLine());

        int i = 1;
        while (i <= ammountOfBusses) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println(i + " autobuso važiavimo laikas H");
            int drivingTimeH = Integer.parseInt(scanner2.nextLine());

            Scanner scanner3 = new Scanner(System.in);
            System.out.println(i + " autobuso važiavimo laikas Min.");
            int drivingTimeM = Integer.parseInt(scanner3.nextLine());

            Scanner scanner4 = new Scanner(System.in);
            System.out.println(i + " autobuso keleivių skaičius");
            int passengersAmmount = Integer.parseInt(scanner4.nextLine());

            drivingTimeTotal = (float) (drivingTimeTotal + drivingTimeH * minutesPerHour + drivingTimeM);
            drivingTimeaverage = Math.round((float) (drivingTimeTotal / ammountOfBusses));

            passengersTotal += passengersAmmount;

            if (passengersAmmount < 10) {
                ammountOfBussesLess10++;

            }

            i++;
        }
        System.out.println("Bendrai pervežtų keleivių skaičius = " + passengersTotal);
        System.out.println("Vidutinis sugaištas važiavimo laikas (min):  " + (int)drivingTimeaverage );
        System.out.println("Autobusų skaičius kur keleivių < 10: " + ammountOfBussesLess10);
    }
}
