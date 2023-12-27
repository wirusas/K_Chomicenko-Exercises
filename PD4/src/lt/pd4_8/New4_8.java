package lt.pd4_8;

import java.util.Scanner;
import java.text.DecimalFormat;

public class New4_8 {
    private static final DecimalFormat df1 = new DecimalFormat("0");
    private static final DecimalFormat df2 = new DecimalFormat("0.00");

    public static void main(String[] args) {

        float wallSquare = 1F;
        float brickPrice = 0F;
        float brickHeight = 0.1F;
        float brickWidth = 0.2F;
        float brickSquare = brickHeight * brickWidth;
        float bricksNeeded = 0F;
        float priceTotal = 0F;

        String[] wallData = {"Įveskite sienos aukštį metrais ", "Įveskite sienos plotį metrais "};
        for (int i = 0; i < wallData.length; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println(wallData[i]);
            float wallParam = Float.parseFloat(scanner1.nextLine());
            wallSquare *= wallParam;
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Įveskite plytos kainą eurais ");
        brickPrice = Float.parseFloat(scanner2.nextLine());

        bricksNeeded = (float) Math.ceil(wallSquare / brickSquare);
        priceTotal = (bricksNeeded * brickPrice);

        System.out.println("Sienai reikės " + df1.format(bricksNeeded) + " plytų");
        System.out.println("Tai kainuos " + df2.format(priceTotal) + " Eurų");
    }
}
