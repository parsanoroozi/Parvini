package session21.waitnotify;

import java.util.ArrayList;


public class Child extends Thread {

    private String name;
    private ArrayList<Cookie> dish;

    public Child(String name, ArrayList<Cookie> dish){
        this.name = name;
        this.dish = dish;
    }
    public void run(){

        synchronized (dish){

        System.out.println(name + " sees " + dish.size() + " cookies");
        if(dish.size()>= 1){
            System.out.println(name + " starts eating...");
            dish.remove(dish.size()-1);
            return;
        }

        while (dish.size() < 1){
            try{
                System.out.println(name + " is waiting for cookie...");
                dish.wait(); // continue after notify
            }catch (InterruptedException e){/*End of this thread*/}
        }

        System.out.println(name + " sees " + dish.size() + " cookies and starts eating...");
        dish.remove(dish.size()-1);
        // end of this thread

        }
    }
}
