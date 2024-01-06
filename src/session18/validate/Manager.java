package session18.validate;

import java.lang.reflect.Field;

public class Manager {
    public static void main(String[] args) throws IllegalAccessException {

        Entity e = new Entity();
        e.setI(100);
        runValidations(e);

        e.setI(14);
        runValidations(e);

    }

    static void runValidations(Object obj) throws IllegalAccessException {
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Validate v = field.getAnnotation(Validate.class);
            field.setAccessible(true);
            if (v != null && field.get(obj) instanceof Integer) {
                if (v.max() >= (Integer) field.get(obj) && v.min() <= (Integer)
                        field.get(obj)) System.out.println("Valid entry");
                else
                    System.out.println("InValid entry");
            }
        }
    }
}
