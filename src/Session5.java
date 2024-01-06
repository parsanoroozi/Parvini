import java.util.ArrayList;

public class Session5 {
    public static void main(String[] args) {

        int[] arr;
        int n = 10;
        arr = new int[n];
        arr[0] = 45;
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        char[] c = new char[10];
        System.out.println(c[9]);


        String s1 = "abx";
        String s2 = "abx";
        if(s1==s2) System.out.println("OK");

        int [] arr1 = {1,2,3,4};
        for(int i : new int[]{1, 10, 100}) System.out.println(i);
        System.out.println(arr1);

//        int [] arr2 = new int[Integer.MAX_VALUE-2];
        System.out.println(Integer.MAX_VALUE);
//        System.out.println(arr2.length);


        ArrayList<String> list = new ArrayList<>(10);

        StringBuffer strbf = new StringBuffer("AB");
        System.out.println(strbf.capacity());
        System.out.println(strbf.length());
        System.out.println(strbf);



    }
}
