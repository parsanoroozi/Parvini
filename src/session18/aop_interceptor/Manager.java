package session18.aop_interceptor;

public class Manager {
    public static void main(String[] args) {
        ITransaction obj = FactoryService.getService();
        obj.createAccount();
        obj.updateAccount();
        obj.deleteAccount();
    }
}
