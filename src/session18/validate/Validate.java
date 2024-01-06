package session18.validate;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {

    int max() default 100;

    int min() default 0;
}
