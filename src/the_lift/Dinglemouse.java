package the_lift;

import java.util.LinkedList;
import java.util.Queue;

public class Dinglemouse {
    public static int[] theLift(final int[][] queues, final int capacity){

        Manager manager = new Manager(queues, capacity);

        return manager.run();




    }
}
