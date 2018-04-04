package Chapter10.Exercises;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Shady Bajary
 * @Exercise 10.7
 * @Title Game: ATM machine
 */
public class Exercise10_07 {

    public static void main(String[] args) {
        int accountID = -1;
        Scanner scan = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100, 0.0);
        }
        do {
            System.out.print("Enter an id (between 0 and 9): ");
            accountID = scan.nextInt();
            if (accountID < 0 || accountID > 9) {
                continue;
            }
            do {
                printMainMenu();
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accounts[accountID].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        double amount = scan.nextDouble();
                        if (amount > accounts[accountID].getBalance()) {
                            System.out.println("The amount is greater than the balance.");
                        } else {
                            accounts[accountID].withDraw(amount);
                        }
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposite: ");
                        amount = scan.nextDouble();
                        accounts[accountID].deposite(amount);
                        break;
                    case 4:
                        break;
                }
                if (choice == 4) {
                    break;
                }
            } while (accountID <= 9 && accountID >= 0);

        } while (true);

    }

    public static void printMainMenu() {
        System.out.println("Main Menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposite");
        System.out.println("4: Exit");
        System.out.print("Enter a choice: ");
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
        this.balance -= amount;
    }

    public void deposite(double amount) {
        this.balance += amount;
    }

}
