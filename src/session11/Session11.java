package session11;

public class Session11 {
    public static void main(String[] args) {
        System.out.println("session11");

        Integer i = 4;

        AbstractTest act = new AbstractChildTest();
        act.printMe();
        AbstractTest.X();
        System.out.println(AbstractTest.name);

        System.out.println(act.getClass());
        System.out.println(act.getClass().getName());

        Object[] things = {
                13,
                "hello",
                new int[4],
                new String[4],
                new char[8]
        };

        Integer num = 10;
        Object o = num;
        Integer x = (Integer) o;
        System.out.println(x.intValue());
//        System.out.println((Integer)o.);
//        System.out.println(();


        for(Object o1 : things) {
            System.out.println(o1.getClass().getName());
        }
    }
}
