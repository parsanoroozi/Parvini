package session9;

public final class SingletonLazy { // lazy fetch

    private SingletonLazy(){}
    private static SingletonLazy instance = null;
    private static SingletonLazy getInstance(){
        if(instance == null) instance = new SingletonLazy();
        return instance;
    }

}
