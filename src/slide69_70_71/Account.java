package slide69_70_71;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        int x = balance + amount;
        balance = x;
    }

    public void withdraw(int amount) {
        int x = balance - amount;
        balance = x;
    }
}
