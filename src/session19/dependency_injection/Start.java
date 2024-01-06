package session19.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import session19.NewStyle;
import session19.Os;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {

        BankClient client = new BankClient();
        new MyContext().injectIn(client);
        client.tarnsfer(11451, 500);

        System.out.println(NewStyle.ON);
        System.out.println(Os.WINDOWS);
    }
}
