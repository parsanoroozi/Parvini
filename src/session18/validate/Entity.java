package session18.validate;

public class Entity {

    @Validate(min = 12, max = 20)
    private int i;

    public void setI(int i) {
        this.i = i;
    }
}
