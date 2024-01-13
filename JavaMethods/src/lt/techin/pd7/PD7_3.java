/**
 * Parašykite Java metodą, kuris skaičiuoja trikampio plotą.
 */

package lt.techin.pd7;

public class PD7_3 {
    public static void main(String[] args) {
        // TODO
        double triangleAre = triangleAreaCalc(10, 10, 10);
        System.out.println(triangleAre);
    }

    public static double triangleAreaCalc(double sideLength1, double sideLength2, double sideLength3){
        double perimeter = (sideLength1+sideLength2+sideLength3) / 2;
        double trieangleArea = Math.sqrt(perimeter*(perimeter-sideLength1)*(perimeter-sideLength2)*(perimeter-sideLength3));
return trieangleArea;
    }

}
