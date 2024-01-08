package session20;

public class T04TestHumanRunnable {
    public static void main(String[] args) throws InterruptedException {

        T04HumanRunnable ali = new T04HumanRunnable("Ali");
//        T04HumanRunnable reza = new T04HumanRunnable("Reza");
//        T04HumanRunnable hasan = new T04HumanRunnable("Hasan");
//
//        // thread making in Jvm level, and not OS
        Thread t1 = new Thread(ali);
//        Thread t2 = new Thread(reza);
//        Thread t3 = new Thread(hasan);
//
        t1.start();
//        t2.start();
//        t3.start();

        t1.join(); // main thread waits for t1 to finish

//        new Thread(new T04HumanRunnable("Ali")).start();
//        new Thread(new T04HumanRunnable("Hasan")).start();
//        new Thread(new T04HumanRunnable("Reza")).start();

        // anonymous
        new Thread(){
            public void run(){
                System.out.println("anonymous");
            }
        }.start();

        // using lambda
        new Thread(() -> System.out.println("lambda")).start();




        // in here main thread ends but process will not terminate because there are some other threads that are running
    }
}
