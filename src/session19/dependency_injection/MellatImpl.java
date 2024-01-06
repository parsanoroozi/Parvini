package session19.dependency_injection;

public class MellatImpl implements ITransfer {
    @Override
    public void transfer(long cardNumber, double amount) {
        System.out.println("Mellat: " + amount + " has transferred to " + cardNumber);
    }
}
