package session18.orm_simulation;

@Table(name = "tbl_account")
public class BankAccount {
    @Column(name = "f_number")
    private int number;
    @Column(name = "f_owner")
    private String owner;
    @Column(name = "f_balance")
    private long balance;

    public BankAccount(int number, String owner, long balance) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }

}
