package lt.PD3_9;

public class Main3_9 {
    public static void main(String[] args) {
        Double myDouble = 5.123456987; //AUTOBOXING
        Float myFloat = 5.598766F;  //AUTOBOXING
        Long myLong = 1236L;  //AUTOBOXING

double mySum = myDouble + myFloat + myLong; // EXAMPLE OF UNBOXING

        System.out.println("BOXED DOUBLE " + myDouble.doubleValue());  //PROVE OF OBJECT BEING AUTOBOXED
        System.out.println("BOXED FLOAT " +  myFloat.hashCode());  //PROVE OF OBJECT BEING AUTOBOXED
        System.out.println("BOXED LONG " + myLong.toString());  //PROVE OF OBJECT BEING AUTOBOXED
        System.out.println("UNBOXED ALL " + mySum);// PROVE OF UNBOXING






    }
}
