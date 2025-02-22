import javax.swing.*;

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
    public void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(bankAccount.getBalance(3894.52));
        bankAccount.deposit(5000.00);

        System.out.println(bankAccount.output());


        }

    }


class ActionListener {
    JPopupMenu popup = new JPopupMenu();
    JMenuItem menuItem = new JMenuItem("A popup menu item");
    menuItem.addActionListener(this);

}