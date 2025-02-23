import java.util.Scanner;

public class BankAccount {
    private double balance;

//    Getter method

    public double getBalance(double amount){
        return amount;
    }
//    Setter method
    public void setBalance(double amount){
        this.balance = amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if (this.balance > 0) {
            this.balance -= amount;
        } else {
            System.out.println("Amount greater than balance.");
        }

        return this.balance;
    }

    public double output(){
            return this.balance;
        }

}

class Transact{
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance: ");
        double amount = input.nextDouble();
        System.out.println("Enter amount to deposit: ");
        double deposit = input.nextDouble();
        bankAccount.setBalance(bankAccount.getBalance(amount));
        bankAccount.deposit(deposit);

        System.out.println(bankAccount.output());


        }

    }

