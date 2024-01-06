package session18.test;

import java.lang.reflect.Method;

public class Manager {
    public static void main(String[] args) {
        System.out.println("test");
        Manager.runTest(TestClass.class);
    }

    static void runTest(Class c) {

        Method[] methods = c.getDeclaredMethods();
        int failedCount = 0;
        for (Method method : methods) {
            method.setAccessible(true);
            try {
                method.invoke(c.newInstance());
                System.out.println("method " + method.getName() + " passes!");
            } catch (Exception e) {
                System.out.println("method " + method.getName() + " fails!");
                System.out.println(e.getCause()); // the cause is the real reason, the level one exception would be InvocationException
                failedCount++;
            }
        }
        System.out.println("number of methods: " + methods.length);
        System.out.println("number of passed methods: " + (methods.length - failedCount));
        System.out.println("number of failed methods: " + failedCount);
        System.out.println((methods.length-failedCount)*100/ methods.length + "% of methods passed successfully!");

    }
}
