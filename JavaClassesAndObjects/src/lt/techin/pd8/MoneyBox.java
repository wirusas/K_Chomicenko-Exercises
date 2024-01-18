package lt.techin.pd8;

public class MoneyBox {
    private double totalAmount;
    private double depositCount;
    private static final double MAX_AMOUNT = 1000.0;


    public MoneyBox() {
        this.totalAmount = 0.0;
        this.depositCount = 0;
    }

    public boolean deposit(double amount) {
        if (amount <= 0 || amount + totalAmount > MAX_AMOUNT) {
            return false;
        }
        totalAmount += amount;
        depositCount++;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > MAX_AMOUNT) {
            return false;
        }
        totalAmount -= amount;
        return true;
    }

    public double getAverageAmount() {
        if (depositCount == 0) {
            return 0.0;
        }
        return totalAmount / depositCount;
    }
}
//    public  boolean withdraw(){
//        return  totalAmount = 0.0;
//
//    }

