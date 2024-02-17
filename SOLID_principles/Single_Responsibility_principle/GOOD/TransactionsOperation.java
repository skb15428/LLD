package SOLID_principles.Single_Responsibility_principle.GOOD;

public class TransactionsOperation {

    public void addMoney(int accountNumber, int amount) {
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.geAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount() + amount);
    }

    public void removeMoney(int accountNumber, int amount) {
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.geAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount() - amount);
    }
}
