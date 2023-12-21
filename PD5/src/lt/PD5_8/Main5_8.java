package lt.PD5_8;

public class Main5_8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {  //row

            for (int j = 1; j <= i; j++) {  // column

                if (j == 1 || j == i || i == 10) {


                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}
