package practice;

public class ParkingController {

    public static int calculatePrice(DurationEntity duration){

        // parking entity creation:
        ParkingEntity parkingEntity = new ParkingEntity();
        parkingEntity.setDuration(duration);

        // price calculation
        if(duration.DAYS > 1) parkingEntity.setPrice(30);
        else parkingEntity.setPrice(2+duration.HOURS);

        return parkingEntity.getPrice();
    }
}
