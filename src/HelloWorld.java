public class HelloWorld {
    public static void main(String[] arg){


        double a = 1.0;

        double b = 0;

        double c = a/b;

        double d = c/c;

        double e = Double.POSITIVE_INFINITY;

        float f = 2.5f;

        System.out.println(Double.isFinite(e));
        System.out.println(Double.isInfinite(e));

        System.out.println(e==f);

        System.out.println(1>1);
    }
}
