package session19.dependency_injection;

public class BankClient {

    @AutoWired(id = "bank")
    private ITransfer service;

    public ITransfer getService() {
        return service;
    }

    public void setService(ITransfer service) {
        this.service = service;
    }

    public void tarnsfer(long cardNumber, double amount) {
        System.out.println("Before transfer...");
        service.transfer(cardNumber, amount);
        System.out.println("After transfer...");
    }
}
