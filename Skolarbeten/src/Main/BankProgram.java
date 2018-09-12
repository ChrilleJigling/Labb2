


package Main;

import Classes.AccountProgram;

public class BankProgram {

    public static void main(String[] args) {
        AccountProgram a1 = new AccountProgram("Chrille");
        AccountProgram a2 = new AccountProgram("Janne");
        
        a1.deposit(435);
        a1.withdraw(245);
        
        a2.deposit(200);
        a2.transfer(100, a1);
        a2.printAll();
        a1.printAll();
        
    }

}
