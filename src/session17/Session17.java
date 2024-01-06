package session17;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Session17 {
    public static void main(String[] args) {
        System.out.println("session 17");

//        Scanner sc = new Scanner(System.in);
//
//        int i = Integer.parseInt(sc.nextLine());
//
//        Exception e = new NullPointerException();
//
//        LinkedList<String> list = new LinkedList<>();
//        Stack<String> stack = new Stack<>();


//        // before java 7
//        FileInputStream obj = null;
//        try{
//            obj = new FileInputStream("a.txt");
//        }catch (NullPointerException e3){
//            System.out.println(e3.getMessage());
//        } catch(Exception e0){
//            e0.getMessage();
//        }finally{
//            try{obj.close();}catch(Exception e1){
//                System.out.println(e1.getMessage());
//            }
//        }
//
//        // java 7 and afterward
//        try(FileInputStream fs = new FileInputStream("a.txt")){
//
//        }catch (NullPointerException | ClassCastException | IOException e2){
//            System.out.println(e2.getMessage());
//        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);
        System.out.println(queue.poll());


    }
}
