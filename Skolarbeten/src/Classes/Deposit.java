
package Classes;

public class Deposit extends TransactionProgram {

    public Deposit(double amount) {
        super(amount);
    }

    
    
    
    @Override
    public void print() {
        System.out.println(toString()+ " deposited");
    }
    
}
