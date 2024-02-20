import java.util.List;
import java.util.ArrayList;

class BankAccount {
    private String accountNumber;
    private double balance;
    private boolean isLocked;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.isLocked = false;
    }

    public void deposit(double amount) {
        if (!isLocked) {
            balance += amount;
        } else {
            System.out.println("The account is locked. Deposit is not allowed.");
        }
    }

    public void withdraw(double amount) {
        if (!isLocked) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("The account is locked. Withdrawal is not allowed.");
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (!isLocked && !recipient.isLocked) {
            if (balance >= amount) {
                balance -= amount;
                recipient.deposit(amount);
            } else {
                System.out.println("Insufficient funds for transfer");
            }
        } else {
            System.out.println("One or both accounts are locked. Transfer is not allowed.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void lockAccount() {
        isLocked = true;
    }

    public void unlockAccount() {
        isLocked = false;
    }
}

class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void createAccount(String accountNumber, double initialBalance) {
        BankAccount account = new BankAccount(accountNumber, initialBalance);
        accounts.add(account);
    }

    public void lockAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.lockAccount();
                return;
            }
        }
        System.out.println("Account not found");
    }

    public void unlockAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.unlockAccount();
                return;
            }
        }
        System.out.println("Account not found");
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}

public class BankAccount2 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.createAccount("123456", 1000);
        bank.createAccount("789012", 500);

        BankAccount account1 = bank.findAccount("123456");
        BankAccount account2 = bank.findAccount("789012");

        account1.transfer(account2, 200);

        System.out.println("Balance of account 1: " + account1.getBalance());
        System.out.println("Balance of account 2: " + account2.getBalance());

        account2.lockAccount();
        account2.deposit(100); // This deposit will not be allowed

        account2.unlockAccount();
        account2.deposit(100); // This deposit will be allowed
        System.out.println("Balance of account 2 after deposit: " + account2.getBalance());
    }
}