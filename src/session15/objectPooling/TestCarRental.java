package session15.objectPooling;

public class TestCarRental {

    public static void main(String[] args) {

        CarRental cr = CarRental.getInstance(3, 5);
        cr.report();

        System.out.println(1);
        Car customer1 = cr.borrow();
        cr.report();

        System.out.println(2);
        Car customer2 = cr.borrow();
        cr.report();

        System.out.println(3);
        Car customer3 = cr.borrow();
        cr.report();

        System.out.println(4);
        Car customer4 = cr.borrow();
        cr.report();

        System.out.println(5);
        Car customer5 = cr.borrow();
        cr.report();

        System.out.println(6);
        Car customer6 = cr.borrow();
        cr.report();

        System.out.println("release 1");
        cr.release(customer1);
        cr.report();

        System.out.println(7);
        Car customer7 = cr.borrow();
        cr.report();
    }
}
