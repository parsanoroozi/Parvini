package session21.waitnotify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Mother {
    public static void main(String[] args) {
        ArrayList<Cookie> dish = new ArrayList<>();
        dish.add(new Cookie());

        new Child("sara", dish).start();
        new Child("elnaz", dish).start();
        new Child("mahdieh", dish).start();

        try {Thread.sleep(2*1000);}catch (InterruptedException e){e.printStackTrace();}
        System.out.println("Mother put 2 more cookies in the dish...");
        try {Thread.sleep(2*1000);}catch (InterruptedException e){e.printStackTrace();}

        dish.add(new Cookie());
        dish.add(new Cookie());

        System.out.println("Mother calls children...");

        synchronized (dish) {dish.notifyAll();}


    }
}
