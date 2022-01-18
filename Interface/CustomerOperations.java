package Interface;
import Class.*;
import java.lang.*;

public interface CustomerOperations
{
    void insertCustomer(Customer c);
    void removeCustomer(Customer c);
    Customer getCustomer(int nid);
    void showAllCustomers();
}
