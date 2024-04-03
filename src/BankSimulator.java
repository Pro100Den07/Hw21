class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining balance: " + balance);
        } else {
            System.out.println("Not enough funds for withdrawal.");
        }
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Remaining balance: " + balance);
    }
}

public class BankSimulator {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread user1 = new Thread(() -> {
            account.withdraw(500);
        });

        Thread user2 = new Thread(() -> {
            account.deposit(300);
        });

        user1.start();
        user2.start();
    }
}