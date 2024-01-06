package session14;

public class TestGreeting {

    public static void main(String[] args) {
        Greeting obj = new Greeting();

        obj.doGreeting(new LanguageInterface() {
            @Override
            public void sayHello() {
                System.out.println("SALAM");
            }
        });

        obj.doGreeting(()-> System.out.println("HELLO"));
    }

}
