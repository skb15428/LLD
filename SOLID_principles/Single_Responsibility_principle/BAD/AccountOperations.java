package SOLID_principles.Single_Responsibility_principle.BAD;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {
    public static Map<Integer, Account> accountMap = new HashMap<>();

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account geAccount(Integer accountNumber) {
        return accountMap.get(accountNumber);
    }

    // This method is performing the transactions responsibility
    // so the class have two functionality one is account and another is
    // transactions
    public void addMoney(int accountNumber, int amount) {
        Account account = accountMap.get(accountNumber);
        account.setTotalAmount(account.getTotalAmount() + amount);
    }

}
