package session21.locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceLock {

    Lock lock = new ReentrantLock();

    void m1(){ // with lock
        System.out.println(Thread.currentThread().getName() + " Entered m1()...");
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " Acquires lock...");
        try{
            // Do something
            try{
                Thread.sleep(10*1000);
            }catch (InterruptedException e){e.printStackTrace();}
        }finally {
            System.out.println(Thread.currentThread().getName() + " Released lock...");
            lock.unlock();
        }

        System.out.println(Thread.currentThread().getName() + " Exiting m1()...");
    }

    void m2(){ // without lock
        System.out.println(Thread.currentThread().getName() + " Entered m2()...");
        try{Thread.sleep(10*1000);}catch (InterruptedException e){e.printStackTrace();}
        System.out.println(Thread.currentThread().getName() + " Exiting m2()...");
    }

}
