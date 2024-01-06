import java.util.Scanner;

public class Session8 {
    public static void main(String[] args) {
        Owner owner = new Owner("Henry");

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println(n+i+j);


    }
}
