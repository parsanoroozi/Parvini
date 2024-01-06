package session18.test;

public class TestClass {

    @Test
    void m1(){ throw new RuntimeException("method 1 exception");}
    @Test
    void m2(){
        throw new RuntimeException("method 2 exception");
    }
    @Test
    void m3(){}
    @Test
    void m4(){}
    @Test
    void m5(){
        throw new RuntimeException("method 5 exception");
    }
    @Test
    void m6(){}
}
