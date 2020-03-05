package slide100_101;

public class Operator extends Thread {
    private Account account1;
    private Account account2;

    public Operator(Account account1, Account account2) {
        this.account1 = account1;
        this.account2 = account2;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            operationDeposit(10);
        }
    }

    private void operationDeposit(int depositSum) {
        int hashAcc1 = account1.hashCode();
        int hashAcc2 = account2.hashCode();

        Account acc1 = null;
        Account acc2 = null;

        if (hashAcc1<hashAcc2){
            acc1=account1;
            acc2=account2;
        }
        else {
            acc1 = account2;
            acc2 = account1;
        }
        synchronized (acc1) {
            System.out.println("Заблокиролван первый счет.");
            synchronized (acc2) {
                System.out.println("Заблокирован второй счет.");
                account1.deposit(depositSum);
                account2.deposit(depositSum);
            }
        }
    }
}
