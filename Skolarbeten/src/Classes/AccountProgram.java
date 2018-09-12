package Classes;

import java.util.ArrayList;

public class AccountProgram {

    private String owner;
    private double balance;
    private static int nAccounts;
    private int number;

    private ArrayList<TransactionProgram> transactionList;

    public AccountProgram(String name) {
        owner = name;
        balance = 0;
        nAccounts++;
        number = nAccounts;
        transactionList = new ArrayList<>();
        transactionList.add(new Creation());
    }

    public void deposit(int amount) {
        balance += amount;
        transactionList.add(new Deposit(amount));
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Not enough funds on account");
        } else {
            balance -= amount;
            transactionList.add(new Withdrawal(amount));
        }
    }

    public void transfer(int amount, AccountProgram to) {
        if (amount > balance) {
            System.out.println("Transfer failed, not enough funds");
        } else {
            balance -= amount;
            transactionList.add(new TransferTo(amount, to));
            to.balance += amount;
            to.transactionList.add(new TransferFrom(amount, this));
        }
    }

    public void printAll() {
        System.out.println(number + "/" + owner + " " + balance);
        System.out.println("Transactions: ");
        for (TransactionProgram t : transactionList) {
            t.print();
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

}
