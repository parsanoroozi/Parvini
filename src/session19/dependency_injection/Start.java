package session19.dependency_injection;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        BankClient client = new BankClient();
        new MyContext().injectIn(client);
        client.tarnsfer(11451, 500);
    }
}
