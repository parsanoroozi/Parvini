import java.util.Arrays;

public class Session6 {

    public String string;

    public static void main(String[] args) {
//        Student s = new Student();
//        s.d = 10.9;
//        s.i = 5;
//        s.s = "Hello from the other side";
//        System.out.println(s);
//        System.out.println(s.i);
//        test(s.clone());
//        System.out.println(s.i);
//        m1();
//        int i = 0x64; // 6*16 + 4
//        int j = 0144; // 8*8*1 + 8*4 + 4
//        int t = 0b01001000; // 8 + 64
//        int m = 1_234_567;
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(t);
//        System.out.println(m);
//        double x = 0.7 + 0.1;
//        System.out.println(x);
//
//        int y = Integer.MAX_VALUE +1;
//        System.out.println(y);
//        roundOff();
//        bingo("BINGIO",0);
//        bingoFor("BINGOO");
//        Adder adder = new Adder();
//        adder.add(10).add(20).add(30).add(40).add(50).showNumber();
        QueryBuilder query = new QueryBuilder();
        query
                .select("branchName")
                .from("branches")
                .where("branchCode=284")
                .print();

        int x = 8;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);
    }


    static void bingo(String word, int i){
        System.out.println(word);
        if (i == word.length()) return;
        word = word.replaceFirst(Character.toString(word.charAt(i)),"*");
        bingo(word, i+1);
    }

    static void bingoFor(String word){
        char[] arr = word.toCharArray();
        for(int i = 0; i< word.length(); i++){
            System.out.println(arr);
            arr[i] = '*';
        }
        System.out.println(arr);
    }

    static void roundOff(){
        double x = 1/7d;
        float y = 1/7f;
        System.out.println(x);
        System.out.println(y);
        System.out.println(1/7f - 1/7d);
    }

    static void test(Student s){
        System.out.println(s);
        s.i = 6;
        System.out.println(s.i);
    }

    static void m1(){
        int[] arr = {1,2,3,4};
        m2(arr);
        Arrays.stream(arr).forEach(i ->System.out.println(i));
        System.out.println(arr);
    }
    static void m2(int[] arr1){

        arr1[2] = 8;
        System.out.println(arr1);

    }
}
