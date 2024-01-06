package session9;

public class StaticUtil {

    public static int id=12;

    public int instanceId = num();

    public void printNoneStatic(){
        System.out.println("none static");
    }

    public int num(){
        System.out.println("loading none static fields");
        return 4;
    }

    static {
        System.out.println("static initialization block");
    }

    {
        System.out.println("initialization block");
    }

    public static void print(){
//        StaticUtil su = new StaticUtil();
//        su.instanceId = 12;
//        su.printNoneStatic();
        System.out.println("print method");
    }
}
