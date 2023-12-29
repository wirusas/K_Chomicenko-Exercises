package lt.pd4_10;

import java.util.Scanner;

public class Main4_10 {
    public static void main(String[] args) {
        float tunelioIlgisKm = 264 / 1000F;
        float laikasPerTuneliS = 0;
        int sekundesValandoje = 3600;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Koks automobilio greitis km/h? ");
        int automobilioGreitis = Integer.parseInt(scanner.nextLine());

        laikasPerTuneliS = tunelioIlgisKm * sekundesValandoje / automobilioGreitis;

        System.out.println(laikasPerTuneliS + " s");
    }
}
