package Chapter08.Exercises;

import java.util.Date;

/**
 *
 * @author Shady Bajary
 * @Exercise
 * @Title
 */
public class Exercise8_07 {

    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);
        System.out.println("Balance: " + account.getBalance()
                + "\nMonthly Interest Rate:" + account.getMonthlyInterestRate()
                + "\nDate created: " + account.getDateCreated());
        account.withDraw(2500);
        account.deposite(3000);
        
        
    }
}

class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance, double annualRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualRate;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12);
    }

    public void withDraw(double amount) {
        this.balance += amount;
    }

    public void deposite(double amount) {
        this.balance -= amount;
    }

}
