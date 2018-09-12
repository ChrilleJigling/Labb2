
package Classes;

public class TransferFrom extends TransactionProgram {
    private AccountProgram from;
    public TransferFrom(double amount, AccountProgram from) {
        super(amount);
        this.from = from;
    }
    
    
    
    @Override
    public void print() {
        System.out.println(super.toString()+ " transfer from "+ from.getOwner());
    }
    

}
