public class Adder {
    private int number;

    public void showNumber() {
        System.out.println(number);
    }

    public Adder add(int i){
        this.number+= i;
        return this;
    }


}
