package lt.PD3_10;

public class Main3_10 {
    public static void main(String[] args) {

        String myString = "5 10 15 -11";
        int mySum = 0;
        String[] myStringArray = myString.split(" ");  // STRING CONVERTS INTO ARRAY STILL STRING FORMAT

        for (int i = 0; i < myStringArray.length; i++) {

            mySum += Integer.parseInt(myStringArray[i]); //SUM TAKES EACH ELEMENT OF NEW ARRAY AND CONVERTS IT INTO INTEGER THEN ADDS TO SUMM

        }
        System.out.println(mySum);
    }
}


