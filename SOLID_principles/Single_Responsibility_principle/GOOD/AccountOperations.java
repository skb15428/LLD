package SOLID_principles.Single_Responsibility_principle.GOOD;

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
}
