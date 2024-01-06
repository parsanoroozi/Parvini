package session18;

@FunctionalInterface
public interface Sample {

    abstract void print();

    default void print1(){
        System.out.println("hello");
    }
}
