package lt.pd5_3;

import java.util.Scanner;

public class Main5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite teigiamą sveikąjį skaičių ir aš pateiksiu visus pirminius nuo 0 iki tavo pateikto skaičiaus ");
        int usersNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Diapazone nuo 0 iki " + usersNumber + " pirminiai skaičiai yra: ");
        int i = 0;
        while (i <= usersNumber) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(i + ", ");
            }
            i++;
        }
    }
}






