package session21.locking;

public class TestBankAccountConcurrentChange {

    public static void main(String[] args) throws InterruptedException {

        BankAccount v = new BankAccount(0);

        Thread t1 = new Thread(()-> {v.change();});
        Thread t2 = new Thread(()-> {v.change();});
        Thread t3 = new Thread(()-> {v.change();});
        Thread t4 = new Thread(()-> {v.change();});

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println(v.getBalance()); // the result would be nondeterministic
        // but if you add synchronized to the method change it will be deterministic
    }

}
