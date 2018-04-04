package Chapter11.Exercises;

import java.util.Date;

/**
 *
 * @author Shady Bajary
 * @Exercise 11.3
 * @Title Subclasses of Account
 */
public class Exercise11_03 {

    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.toString());
        CheckingAccount ca = new CheckingAccount();
        System.out.println(ca.toString());
        SavingAccount sa = new SavingAccount();
        System.out.println(sa.toString());
    }
}

final class SavingAccount {

    @Override
    public String toString() {
        return "Saving Account";
    }

}

class CheckingAccount {

    @Override
    public String toString() {
        return "Checking Account";
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

    @Override
    public String toString() {
        return "Account";
    }

}
