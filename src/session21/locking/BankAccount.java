package session21.locking;

// shared object
public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // critical section
    synchronized void change() {  // at the end, makes no change to the filed!
        for (int i = 0; i < 3; i++) {
            this.balance = this.balance + 1;
            this.delay(this.delay); // Delay added to show the non-atomic behaviour of methods
            this.balance = this.balance - 1;
        }
    }

    public int getBalance() {
        return balance;
    }

    int delay = 50;

    void delay(int d) {
        try {
            Thread.sleep(d);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
