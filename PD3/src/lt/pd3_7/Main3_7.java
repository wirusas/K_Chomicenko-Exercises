package lt.PD3_7;

public class Main3_7 {
    public static void main(String[] args) {
       String myString1 = "   HELLO";
       String myString2 = " Dear";
       String myString3 = " How are You? ";

       String mySentence = myString1 + myString2 + myString3;
       String myConcat = myString1.concat(myString2.concat(myString3));

        System.out.println(myString1);
        System.out.println(mySentence);
        System.out.println("String length = " + mySentence.length());
        System.out.println("Strings comparition = " + myString1.equals(myString2));
        System.out.println("char at 5 = " + myString1.charAt(5));
        System.out.println("concat = " + myConcat);
        System.out.println("to lower case = " + myString1.toLowerCase());
        System.out.println("remove spaces = " + mySentence.trim());






    }
}
