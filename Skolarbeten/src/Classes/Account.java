
package Classes;


public class Account {
      
    private String owner;
    int balance;
    private int accountNumber;
    private static int nrAccounts = 0;
    
    public Account(String name) {
        owner = name;
        balance = 0;
        nrAccounts++;
        accountNumber = nrAccounts;
        
    }
    public void deposit (int amount) {
        balance = balance + amount;
    }
    public void withdraw (int amount) {
        if(amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("inte tillräckligt med pengar");
        }
    }
    public int getBalance () {
        return balance;
    }
    @Override
    public String toString () {
        return accountNumber + "/" + owner + ": " + balance;
    }

    public void transfer(int i, Account acc1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
