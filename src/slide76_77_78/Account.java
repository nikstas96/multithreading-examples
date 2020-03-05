package slide76_77_78;

public class Account {
    private int balance;
    private Object lock = new Object();

    public int getBalance() {
        return balance;
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        synchronized (lock) {
            int x = balance + amount;
            balance = x;
        }
    }

    public void withdraw(int amount) {
        synchronized (lock) {
            int x = balance - amount;
            balance = x;
        }
    }
}
