
package CBMTS;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author hp
 */
public class Transaction {
    
    //private String TransactionID;
    private String PayerName;
    private String PayeeName;
    //private Date TransactionDate;
    private double amount;
    //private String hashCode;

    public Transaction(String PayerName, String PayeeName, double amount) {
        this.PayerName = PayerName;
        this.PayeeName = PayeeName;
        this.amount = amount;
    }

    public String getPayerName() {
        return PayerName;
    }

    public void setPayerName(String PayerName) {
        this.PayerName = PayerName;
    }

    public String getPayeeName() {
        return PayeeName;
    }

    public void setPayeeName(String PayeeName) {
        this.PayeeName = PayeeName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
      
}
