package zara.org.Entities;

import java.io.Serializable;

public class Customer implements Serializable {
    private int customerId;
    private String customerName;
    private String customerAddress;

    public int getCustomerId() {
        return customerId;
    }

    public  void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return  customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


}
