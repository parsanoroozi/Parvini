package session21;

public class T15SleepInterrupt {
    public static void main(String[] args) {

        Thread sleepy = new Thread(){
            public void run(){
                System.out.println("I am going to sleep for 10 seconds...");
                try{Thread.sleep(10*1000);}catch(InterruptedException e){
                    System.out.println("why did you interrupt me?");
                }
            }
        };

        sleepy.start();
        try{Thread.sleep(3*1000);}catch(InterruptedException e){e.printStackTrace();}
        sleepy.interrupt();

    }
}
