

public class Student { // user defined

    int i;
    double d;
    String s;

    public  Student(){}

    public Student(int i, double d, String s){
        this.i = i;
        this.d = d;
        this.s = s;
    }

    @Override
    public Student clone() {
        return new Student(this.i,this.d,this.s);
    }
}
