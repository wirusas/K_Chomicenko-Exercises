package lt.pd6_20;

import java.util.Arrays;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main6_20 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        int workersNo = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite darbuotojų skaičių");
        workersNo = scanner.nextInt();


        double[] workersSalaries = new double[workersNo];

        for (int i = 0; i < workersNo; i++) {
            System.out.println("Įveskite " + (i + 1) + "-o darbuotojo atlyginimą");
            workersSalaries[i] = scanner.nextDouble();
        }
        System.out.println("\nAtlyginimai prieš atlyginimo kėlimą:");
        for (double element : workersSalaries) {
            System.out.print(element + ", ");
        }

        for (int i = 0; i < workersSalaries.length; i++) {
            if (workersSalaries[i] < 1000) {
                String temp = df.format((workersSalaries[i] * 1.1));
                workersSalaries[i] = Double.parseDouble(temp);

            } else {

                String temp = df.format(workersSalaries[i] * 1.05);
                workersSalaries[i] = Double.parseDouble(temp);
            }
        }

        System.out.println("\n\nAtlyginimai po atlyginimo kėlimo:");
        for (double element : workersSalaries) {
            System.out.print(element + ", ");
        }
    }
}
