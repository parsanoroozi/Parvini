package session18.aop_interceptor;

import java.lang.reflect.Method;

public class TransactionProxy implements ITransaction {
    @Override
    public void createAccount() {
        TransactionClass tc = new TransactionClass();
        try {
            Method m = tc.getClass().getMethod("createAccount");
            if(m.getAnnotation(Transactional.class) != null)
                TransactionProxy.invoke(m, tc);
            else tc.createAccount();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateAccount() {
        TransactionClass tc = new TransactionClass();
        try {
            Method m = tc.getClass().getMethod("updateAccount");
            if(m.getAnnotation(Transactional.class) != null)
                TransactionProxy.invoke(m, tc);
            else tc.updateAccount();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteAccount() {
        TransactionClass tc = new TransactionClass();
        try {
            Method m = tc.getClass().getMethod("deleteAccount");
            if(m.getAnnotation(Transactional.class) != null)
                TransactionProxy.invoke(m, tc);
            else tc.deleteAccount();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void invoke(Method m, Object proxy) {
        System.out.println(m.getName()+" method: ");
        try {
            System.out.println("Start transaction");
            m.invoke(proxy);
            System.out.println("Commit transaction");
        } catch (Exception e) {
            System.out.println("Rollback transaction");
        }

    }
}
