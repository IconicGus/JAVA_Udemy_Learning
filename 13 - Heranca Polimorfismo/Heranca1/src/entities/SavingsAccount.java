package entities;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Double balance, String holder, Integer number, double interestRate) {
        super(balance, holder, number);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }
}
