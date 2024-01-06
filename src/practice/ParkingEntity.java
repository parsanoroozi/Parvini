package practice;

public class ParkingEntity {
    private DurationEntity duration;
    private int price;

    public DurationEntity getDuration() {
        return duration;
    }

    public void setDuration(DurationEntity duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ParkingEntity{" +
                "duration=" + duration +
                ", price=" + price +
                '}';
    }
}
