
public class TransitTrip extends Trip {
    public TransitTrip(double firstPartDistance, double secondPartDistance, int speed, int stopoverTime) {
        super(speed, stopoverTime);
        setDistance(firstPartDistance, secondPartDistance);
        setTripTime(getDistance(), speed, stopoverTime);
        type = "transit";
    }

    public TransitTrip(double startTransitDistance, double transitEndDistance, int speed) {
        this(startTransitDistance, transitEndDistance, speed, 0);
    }

    private void setDistance(double firstPartDistance, double secondPartDistance) {
        double distance = firstPartDistance + secondPartDistance;
        setDistance(distance);
    }
}
