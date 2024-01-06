package session18.aop_interceptor;

public class TransactionClass implements ITransaction {

    @Transactional
    public void createAccount(){
        System.out.println("account created!");
    }
    @Transactional
    public void updateAccount(){
        throw new RuntimeException();
//        System.out.println("account updated!");
    }

    public void deleteAccount(){
        System.out.println("account deleted!");
    }
}
