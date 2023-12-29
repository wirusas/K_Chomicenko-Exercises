package lt.pd5_5;

public class Main5_5 {
    public static void main(String[] args) {
      for (int i = 0; i<= 100; i ++) {
if(i % 5 != 0){
    System.out.print(i + ", ");
    if (i == 88)
        break;
}
if(i % 22 == 0)
    System.out.println("\n");
      }
    }
}
