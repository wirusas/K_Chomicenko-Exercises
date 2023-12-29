package lt.pd5_6;

import java.util.Scanner;

public class Main5_6 {
    public static void main(String[] args) {

        int egluciuKiekis = 0;
        float egluciuAuksciuSuma = 0F;
        int eglutesAukstis = 0;
//        float eglutesAukscioVidurkis = 0F;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Kiek eglučių atvežė?");
        egluciuKiekis = Integer.parseInt(scanner1.nextLine());

        int i = 1;
        while (i <= egluciuKiekis) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Įveskite: " + i + " eglutės aukštį");
            eglutesAukstis = Integer.parseInt(scanner2.nextLine());

            egluciuAuksciuSuma += eglutesAukstis;
            i++;
        }
        float eglutesAukscioVidurkis = (float) egluciuAuksciuSuma / egluciuKiekis;

        System.out.println("Eglutės aukščio vidurkis yra: " + eglutesAukscioVidurkis + " cm");

    }
}
