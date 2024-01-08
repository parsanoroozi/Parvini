package session20;

public class T04HumanRunnable implements Runnable {
    private String name;

    public T04HumanRunnable(String name){this.name = name;}

    @Override
    public void run() {
        for(;;){
            eat();
            talk();
            walk();
        }
    }

    void delay(int delayTime){
        try{
            Thread.sleep(delayTime);
        }catch(InterruptedException e){e.printStackTrace();}
    }

    void eat(){
        System.out.println(this.name + " is eating...");
        delay(70);
    }

    void walk(){
        System.out.println(this.name + " is walking...");
        delay(50);
    }

    void talk(){
        System.out.println(this.name + " is talking");
        delay(20);
    }
}
