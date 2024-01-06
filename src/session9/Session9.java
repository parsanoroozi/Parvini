package session9;

public  class Session9 {
    public static void main(String[] args) {

        System.out.println(StaticUtil.id);
        StaticUtil.print();

        System.out.println("----------------------------------------");

        StaticUtil su = new StaticUtil();
        su.print();
        System.out.println(su.id);


        SingletonEager obj1 = SingletonEager.getObj();
        SingletonEager obj2 = SingletonEager.getObj();
        System.out.println(obj1);
        System.out.println(obj2);


    }

}
