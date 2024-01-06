package session16.multiton;

public class MultitonTest {
    public static void main(String[] args) {

        System.out.println("1:");
        System.out.println(Multiton.getInstance(1).hashCode());
        System.out.println("1:");
        System.out.println(Multiton.getInstance(1).hashCode());
        System.out.println("2:");
        System.out.println(Multiton.getInstance(2).hashCode());
        System.out.println("4:");
        System.out.println(Multiton.getInstance(4).hashCode());
        System.out.println("3:");
        System.out.println(Multiton.getInstance(3).hashCode());
        System.out.println("4:");
        System.out.println(Multiton.getInstance(4).hashCode());

    }
}
