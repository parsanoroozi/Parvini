package session9;

public final class SingletonEager {

    private SingletonEager(){}
    private int value;
    public static SingletonEager obj = new SingletonEager();
    public static SingletonEager getObj(){return obj;}

    public int getValue(){return this.value;}
    public void setValue(int value){this.value = value;}
}
