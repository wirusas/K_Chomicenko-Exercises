package lt.PD3_4;

public class Main3_4 {
    public static void main(String[] args) {
        boolean myTrue = true;
        boolean myFalse = false;
        boolean result1 = (myTrue == myFalse);
        boolean result2 = (!myTrue == myFalse);
        boolean result3 = (!myTrue == !myFalse);
        String result4 = "";
        if (myFalse == myTrue) {
            result4 = "Yes";
        } else {
            result4 = "Nope";
        }
        boolean result5 = (myTrue && myFalse);
        boolean result6 = (myTrue || myFalse);

        System.out.println("result1 " + result1);
        System.out.println("result2 " + result2);
        System.out.println("result3 " + result3);
        System.out.println("result4 " + result4);
        System.out.println("result5 " + result5);
        System.out.println("result6 " + result6);

    }

}
