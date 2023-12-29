package lt.pd4_7;

import java.util.Scanner;

public class Main4_7 {
    public static void main(String[] args) {
        String[] weekDays = {"Monday", "Tuesdat", "Wednesday", "Thursday", "Friday"};
//int lesonsPerDay = 0;
        int lessonsTotal = 0;
        int minutesPerLesson = 45;
        int minutesTotal = 0;

        for (int i = 0; i < weekDays.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter how many lessons on " + weekDays[i] + " ");

            int lessonsPerDay = Integer.parseInt(scanner.nextLine());
            lessonsTotal += lessonsPerDay;
            minutesTotal = lessonsTotal * minutesPerLesson;
        }
        System.out.println("You have " + lessonsTotal + " lessons per week");
        System.out.println("You have " + minutesTotal + " minutes of lessons per week");

    }
}
