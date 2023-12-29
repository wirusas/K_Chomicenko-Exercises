package lt.pd5_2;

public class Main5_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i+3; j++) {
                if (j == 1  || i == 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }


    }
}
