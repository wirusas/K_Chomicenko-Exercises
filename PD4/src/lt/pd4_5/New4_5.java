package lt.pd4_5;

public class New4_5 {
    public static void main(String[] args) {
        boolean myBool = true;
        String answerTrue = (myBool)? "Teisybė" : "Netiesa \n";
        String answerFalse = (!myBool)? "Teaisybė" : "Netiesa";

        System.out.println(answerTrue);
        System.out.println(answerFalse);
    }
}
