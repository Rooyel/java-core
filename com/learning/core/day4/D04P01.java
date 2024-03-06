package com.learning.core.day4;
import java.util.Scanner;

class LowBalanceException extends Exception {
    private static final long serialVersionUID = 1L;

    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    private static final long serialVersionUID = 1L;

    public NegativeAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (initialBalance < 1000) {
            throw new LowBalanceException("Low balance in the account.");
        }
        this.balance = initialBalance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("Negative amount cannot be deposited.");
        }
        this.balance += amt;
        System.out.println("Amount " + amt + " deposited successfully.");
    }

    public float getBalance() throws LowBalanceException {
        if (this.balance < 1000) {
            throw new LowBalanceException("Low balance in the account.");
        }
        return this.balance;
    }
}

public class D04P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number:");
        int accNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter customer name:");
        String custName = scanner.nextLine();
        System.out.println("Enter account type (Savings/Current):");
        String accType = scanner.nextLine();
        System.out.println("Enter initial balance:");
        float initialBalance = scanner.nextFloat();

        try {
            BankAccount bankAccount = new BankAccount(accNo, custName, accType, initialBalance);

            System.out.println("Enter amount to deposit:");
            float depositAmount = scanner.nextFloat();
            bankAccount.deposit(depositAmount);

            System.out.println("Current balance: " + bankAccount.getBalance());
        } catch (LowBalanceException lowBalanceException) {
            System.out.println("LowBalanceException: " + lowBalanceException.getMessage());
        } catch (NegativeAmountException negativeAmountException) {
            System.out.println("NegativeAmountException: " + negativeAmountException.getMessage());
        } finally {
            scanner.close();
        }
    }
}
