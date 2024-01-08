package session20;

public class ShutDownHook {
    public static void main(String[] args) {

        System.out.println("Process started");

        Thread t = new Thread(){
            public void run(){
                System.err.println("GoodBye world!");
            }
        };

        Runtime.getRuntime().addShutdownHook(t);

        System.out.println("the rest of the code");

        System.exit(0); // run the shutdown hook and terminate jvm process
        Runtime.getRuntime().halt(0); // no shutdown hook
        throw new RuntimeException(); // run the shutdown hook and terminate jvm process

    }
}
