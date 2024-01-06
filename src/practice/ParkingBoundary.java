package practice;

import java.util.Scanner;

public class ParkingBoundary {
    private int days;
    private int hours;

    public void calculatePrice() {

        Scanner sc = new Scanner(System.in);
        boolean wrongDayFormat = true;

        while (wrongDayFormat) {
            try {

                // getting days:
                System.out.println("Number of DAYS you've been here:");
                this.days = Integer.parseInt(sc.nextLine());

                if (this.days < 0) throw new Exception();

                wrongDayFormat = false;

            } catch (Exception e) {

                System.out.println("Wrong days input format");
                System.out.println();
            }
        }

        boolean wrongHourFormat = true;
        while (wrongHourFormat) {
            try {

                // getting hours:
                System.out.println("Number of HOURS you've been here:");
                this.hours = Integer.parseInt(sc.nextLine());

                if (this.hours < 0 || this.hours > 23) throw new Exception();


                wrongHourFormat = false;

            } catch (Exception e) {

                System.out.println("Wrong hours input format");
                System.out.println();
            }
        }


        System.out.println("Your total debt: " + ParkingController.calculatePrice(new DurationEntity(this.days, this.hours)));
        System.out.println("------------------------------------------------------");
    }
}
