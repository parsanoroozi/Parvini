package session15.objectPooling;

import java.util.HashMap;
import java.util.Map;

public class CarRental {

    private static CarRental cr = null;
    private HashMap<Car, Boolean> carList = null;
    private int capacity=0;

    public static CarRental getInstance(int min,int max){
        if(cr == null) cr = new CarRental();
        cr.carList = new HashMap<>(max);
        cr.capacity = max;
        for(int i = 0; i< min; i++){
            cr.carList.put(new Car(), true);
        }
        return cr;
    }

    public void report(){

        System.out.println("total cars: " + this.carList.size());
        System.out.println("free cars: " + this.carList.entrySet().stream().filter(Map.Entry::getValue).count());
        System.out.println("borrowed cars: " + this.carList.entrySet().stream().filter(o -> !o.getValue()).count());
        System.out.println();
    }

    public Car borrow(){
        Car c =  this.carList.entrySet().stream().filter(Map.Entry::getValue).findFirst().map(Map.Entry::getKey).orElse(null);

        if(c == null){

            if(this.carList.size() >= this.capacity){

                System.out.println("no cars available!");
            }else{

                c = new Car();
                this.carList.put(c,false);
            }
        } else {
            this.carList.put(c,false);
        }

        return c;
    }

    public void release(Car customer){
        this.carList.put(customer,true);
    }

}
