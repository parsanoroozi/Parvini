package session19.dependency_injection;

public class MeliImpl implements ITransfer {

    @Override
    public void transfer(long cardNumber, double amount) {
        System.out.println("Melli: " + amount + " has transferred to " + cardNumber);
    }
}
