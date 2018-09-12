
package Classes;
import java.util.Date;
public abstract class TransactionProgram {
    private int id;
    private double amount;
    private Date timeStamp;
    private static int nTransactions;
    public TransactionProgram(double amount) {
        timeStamp = new Date();
        this.amount = amount;
        id = nTransactions;
        nTransactions++;
    }
    @Override
    public String toString() {
       return timeStamp + " [" + id + "] " + amount;  
    }
    
    public abstract void print();
}
