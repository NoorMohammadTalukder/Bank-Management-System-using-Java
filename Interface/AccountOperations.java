package Interface;
import java.lang.*;
import Class.*;

public interface AccountOperations
{
    void insertAccount(Account a);
    void removeAccount(Account a);
    Account getAccount(int accountNumber);
    void showAllAccounts();
}
