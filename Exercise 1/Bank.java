package Practice;

public class Bank {
    public double balance;
    public double rate;

    public Bank() {
    }

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterest(double balance, double rate) {

        return this.balance * (this.rate /1200);
    }
}
