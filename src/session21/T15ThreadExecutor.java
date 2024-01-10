package session21;

import session20.T04HumanRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class T15ThreadExecutor {
    public static void main(String[] args) {

        // generating a thread pool with one thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // submitting a job to it and let it handle the rest of it (execution, ...), no need to create thread directly.
        executor.submit(new T04HumanRunnable("Ali"));
    }
}
