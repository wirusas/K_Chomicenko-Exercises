package lt.pd6_16;

import java.util.*;

public class Main6_16 {
    public static void main(String[] args) {
//FOR DEMO WILL USE ONLY 6 VALUES AND 3 MONTHS

        String[] months = {"Sausio", "Vasario", "Kovo"};
        float[] janTemp = new float[31];
        float[] febTemp = new float[31];
        float[] marchTemp = new float[31];
        float janSum = 0;
        float febSum = 0;
        float marchSum = 0;
        float janAv = 0;
        float febAv = 0;
        float marchAv = 0;
        float totalAv = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < months.length; i++) {
            int daysCount = 0;
            for (int j = 0; j < janTemp.length; j++) {
                System.out.println("Įveskite " + months[i] + " mėn." + (j + 1) + "-os dienos temperatūrą\nsuvedę mėnesio duomenis suveskite 100,\n" +
                        "kad pereitumėte prie kito mėnesio ir tt.");
                float temp = Float.parseFloat(scanner.nextLine());
                if (temp == 100)
                    break;

                if (i == 0) {
                    janTemp[j] = temp;
                    janSum += temp;
                    daysCount++;
                    janAv = janSum / daysCount;
                } else if (i == 1) {
                    febTemp[j] = temp;
                    febSum += temp;
                    daysCount++;
                    febAv = febSum / daysCount;
                } else {
                    marchTemp[j] = temp;
                    marchSum += temp;
                    daysCount++;
                    marchAv = marchSum / daysCount;
                }
            }


        }

        totalAv = (janAv + febAv + marchAv) / months.length;

        System.out.println("Vidutinė sausio temperatūra: " + (float) Math.round(janAv * 100) / 100);
        System.out.println("Vidutinė vasario temperatūra: " + (float) Math.round(febAv * 100) / 100);
        System.out.println("Vidutinė kovo temperatūra: " + (float) Math.round(marchAv * 100) / 100);
        System.out.println("Bendras atliktų matavimų vidurkis: " + (float) Math.round(totalAv * 100) / 100);
    }
}
