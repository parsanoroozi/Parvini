package session18.orm_simulation;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Manager {
    public static void main(String[] args) throws IllegalAccessException {
        BankAccount obj = new BankAccount(1234, "Ali", 1200);
        Manager.showSql(obj);
    }

    static void showSql(Object entity) throws IllegalAccessException {
        Class c = entity.getClass();
        Table t = (Table) c.getAnnotation(Table.class);
        StringBuffer query = new StringBuffer("INSERT INTO " + t.name());
        Field[] fields = c.getDeclaredFields();
        StringBuffer columns = new StringBuffer();
        StringBuffer values = new StringBuffer();
        for(Field field : fields){
            field.setAccessible(true);
            if(Arrays.stream(fields).toList().indexOf(field) != 0){
                columns.append(",");
                values.append(",");
            }
            Column column = field.getAnnotation(Column.class);
            columns.append(column.name());
            if(field.get(entity) instanceof String) values.append("'").append(field.get(entity)).append("'");
            if(field.get(entity) instanceof Number) values.append(field.get(entity));
        }
        if(fields.length > 0) query.append(" (").append(columns).append(") VALUES(").append(values).append(")");

        System.out.println(query);
    }
}
