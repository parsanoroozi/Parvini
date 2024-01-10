package session21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class T16TestThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i< 50; i++){
                    System.out.println("11111");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        executor.submit(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i< 40; i++){
                    System.out.println("22222");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        executor.submit(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i< 30; i++){
                    System.out.println("33333");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        executor.submit(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i< 20; i++){
                    System.out.println("44444");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        executor.submit(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i< 10; i++){
                    System.out.println("55555");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        executor.shutdown();
    }
}
