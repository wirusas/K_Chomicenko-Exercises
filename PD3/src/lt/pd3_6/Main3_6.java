package lt.PD3_6;

public class Main3_6 {
    public static void main(String[] args) {

        Integer myInt1 = new Integer(10); //CREATE WRAPPER (OBJECT) INSTEAD OF PRIMITIVE
        Integer myInt2 = 20;
        int myIntSum = myInt2 + myInt1; //AUTO CONVERTING INTO PRIMITIVE
        Boolean myBool = true;
        Character myCh1 = 'a';
        char myCh2 = 'b';
        Float myFloat = 1.56F;

        System.out.println(myInt1.toString()); //PRINTING AS AN OBJECT
        System.out.println(myBool.toString()); //PRINTING AS AN OBJECT
        System.out.println(myCh1.toString()); //PRINTING AS AN OBJECT
        System.out.println(myInt2.toString()); //PRINTING AS AN OBJECT
        System.out.println(myFloat.toString()); //PRINTING AS AN OBJECT

        System.out.println(myIntSum); //PRINTING AS A PRIMITIVE
        System.out.println(myCh2); //PRINTING AS A PRIMITIVE


    }
}
