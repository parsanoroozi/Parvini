package the_lift;

public class MyTest {
    public static void main(String[] args) {
        System.out.println("my test");
        final int[][] queues = {
                new int[0], // G
                new int[0], // 1
                new int[]{5,5,5}, // 2
                new int[0], // 3
                new int[0], // 4
                new int[0], // 5
                new int[0], // 6
        }; // {0,2,5,0}
        final int[] result = Dinglemouse.theLift(queues,5);
        // it never ends...
        System.out.println(result);
    }
}
