
package Classes;

public class TransferTo extends TransactionProgram {
    private AccountProgram to;
    
    public TransferTo(double amount, AccountProgram to) {
        super(amount);
        this.to = to;
    }

    @Override
    public void print() { 
        System.out.println(super.toString()+ " transfer to "+ to.getOwner());
    }
}
