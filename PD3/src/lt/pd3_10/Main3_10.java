package lt.PD3_10;

public class Main3_10 {
    public static void main(String[] args) {
        double myDouble = 5.123456987;
        float myFloat = 5.598766f;
        long myLong = 15986487;

        float myDoubleToFloat = (float) myDouble;
        int myFloatToInt = (int) myFloat;
        long myFloatToLogn = (long) myFloat;
        double myLongToDouble = (double) myLong;

        System.out.println("double to float " + myDoubleToFloat);
        System.out.println("float to int " + myFloatToInt);
        System.out.println("float to long " + myFloatToLogn);
        System.out.println("long to double " + myLongToDouble);




    }
}
