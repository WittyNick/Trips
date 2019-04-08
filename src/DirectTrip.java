
public class DirectTrip extends Trip {

    public DirectTrip(double distance, int speed, int stopoverTime) {
        super(speed, stopoverTime);
        setDistance(distance);
        setTripTime(distance, speed, stopoverTime);
        type = "direct";
    }

    public DirectTrip(double distance, int speed) {
        this(distance, speed, 0);
    }
}
