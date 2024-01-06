public class Test {
    int i;

    void m(){
        int i;
        i = 16;
        this.i = i;
        System.out.println(this.i);
    }

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();

        System.out.println("Used Memory     : "+(r.totalMemory() - r.freeMemory())+" bytes");
        System.out.println("Free Memory     : "+(r.freeMemory())+" bytes");
        System.out.println("Total Memory    : "+r.totalMemory()+" bytes");
        System.out.println("Max Memory      : "+r.maxMemory()+" bytes");
        Test t = new Test();
        t.m();
    }
}
