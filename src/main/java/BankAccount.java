public class BankAccount
{
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public void withdraw(double amount)
    {
        this.balance -= amount;
    }
}
