package Practice;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank(1000, 6.8);
        double interest = bank.calculateInterest(bank.balance,bank.rate);
        System.out.println("Tiền lãi là:" + Math.round(interest*100.0)/100.0);
    }
}
