
package Classes;

public class Withdrawal extends TransactionProgram{
     public Withdrawal(double amount) {
        super(amount);
    }

    
    
    
    @Override
    public void print() {
        System.out.println(toString()+ " withdrawn");
    }
    
}
