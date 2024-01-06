
public class TestStudent {

    public static void main(String[] args) {

        Student s = null;

        s = new Student();

        s.i = 100;
        s.d = 5.5;
        s.s = "ACM";

        Integer j = 10;
        int k = j;

        Integer num = new Integer(10);

        if(num.equals(j) ) System.out.println("hello");
        if(k == j ) System.out.println("10");
        else System.out.println("not equal");
    }
}
