package session19.dependency_injection;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class MyContext {
    private final String configFile = "samples/samples/src/session19/dependency_injection/my-context.txt";

    public Object getBean(String id) {  // factory method

        Object obj = null;
        Properties p = new Properties();
        try {
            p.load(new FileInputStream(configFile));
            Class type = Class.forName(p.getProperty(id));
            obj = type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void injectIn(Object client) {

        try {
            Class type = client.getClass();
            for (Field field : type.getDeclaredFields()) {
                field.setAccessible(true);
                AutoWired aw = field.getAnnotation(AutoWired.class);
                if (aw != null) field.set(client, getBean(aw.id())); // injection
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
