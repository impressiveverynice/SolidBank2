package com.example.solidbank;



import java.util.List;

public interface AccountDAO {
    List<Account> getClientAccount(String clientID);
    void createNewAccount(Account account);
    void updateAccount(Account account);
    List<Account>getClientAccountsByType(String clientID, AccountType accountType);
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    Account getClientAccount(String clientID, String accountID);

}
