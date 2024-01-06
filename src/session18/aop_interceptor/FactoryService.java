package session18.aop_interceptor;

public class FactoryService {

    public static ITransaction getService(){
        return new TransactionProxy();
    }
}
