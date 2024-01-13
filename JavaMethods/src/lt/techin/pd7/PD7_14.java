/**
 * Parašykite Java metodą, kuris grąžina n eilučių ir m stulpelių skaičių matricą.
 */

package lt.techin.pd7;

public class PD7_14 {
    public static void main(String[] args) {
        rowsColumnsDrawer(3, 4);
    }

    public static void rowsColumnsDrawer(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
