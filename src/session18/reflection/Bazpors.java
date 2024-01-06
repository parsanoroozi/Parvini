package session18.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Bazpors {
    public static void main(String[] args) throws IllegalAccessException {
        X x = new X();
        new Bazpors().Confess(x);

        try {
            new Bazpors().Confess(Class.forName("session18.reflection.X"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    void Confess(Object obj) throws IllegalAccessException { // Using Reflection API

        Class<?> c = obj.getClass(); // getting the Class object that has all the info about the class

        System.out.println(c.getName());

        Field[] fields = c.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName());
            System.out.println(field.get(obj));
            field.set(obj,12);
            System.out.println(field.get(obj));
        }

        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) System.out.println(method.getName());

        try {
            methods[1].invoke(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void Confess(Class c) { // Using Reflection API

        System.out.println("getting from class : "+c.getName());

        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) System.out.println(field.getName());

        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) System.out.println(method.getName());

    }
}
