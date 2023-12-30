package lt.pd5_10;

import java.util.Scanner;

public class Main5_10 {
    public static void main(String[] args) {
        int begginingNo = 0;
        int endingNo = 0;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter beggining number");
        begginingNo = Integer.parseInt(scanner1.nextLine());

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter ending number");
        endingNo = Integer.parseInt(scanner2.nextLine());

        System.out.println("Jūsų pasirinktame intervale skaičiai, kurie dalijasi iš 3, bet nesibaigia 3 yra:");
        for (int i = begginingNo; i<= endingNo; i++){
            if(i % 10 != 3 && i % 3 == 0){
                System.out.print(i + ", ");
                if(i % 20 == 0)
                    System.out.println();
            }

        }

    }
}
