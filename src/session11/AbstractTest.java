package session11;

abstract public class AbstractTest {
    public int publicint;
    protected int protectedint;
    int pakcageprivateint;
    private int privateint;
    public static String name="Petter";

    static void X(){
        System.out.println("X");
    }

    void printMe(){
        System.out.println("hell");
    }

    abstract void printMe1();
}
