package lt.pd5_7;

import java.util.Scanner;

public class Main5_7 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Kiek dalyvavo bėgikų? ");

        int begikuSkaicius = Integer.parseInt(scanner1.nextLine());
        int greiciausiasBegikas = 0;
        float vidutinisLaikas = 0F;
        float begikuLaikuSuma = 0F;

        int i = 1;
        while (i <= begikuSkaicius) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Įveskite " + i + " bėgiko laiką: ");
            int begikoLaikas = Integer.parseInt(scanner2.nextLine());
            begikuLaikuSuma += begikoLaikas;

            vidutinisLaikas = begikuLaikuSuma / begikuSkaicius;
            if (begikoLaikas < greiciausiasBegikas || greiciausiasBegikas == 0) {
                greiciausiasBegikas = begikoLaikas;
            } else begikoLaikas = begikoLaikas;
            i++;
        }
        System.out.println("Greičiausio bėgiko laikas: " + greiciausiasBegikas);
        System.out.println("Jis buvo: " + (vidutinisLaikas - greiciausiasBegikas) + " sek greitesnis už vidurkį");
    }
}
