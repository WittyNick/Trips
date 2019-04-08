
public class ArcTrip extends Trip {
    public ArcTrip(double directDistance, double radius, int speed, int stopoverTime) {
        super(speed, stopoverTime);
        setDistance(directDistance, radius);
        setTripTime(getDistance(), speed, stopoverTime);
        type = "arc";
    }

    public ArcTrip(double directDistance, double radius, int speed) {
        this(directDistance, radius, speed, 0);
    }

    private void setDistance(double directDistance, double radius) {
        double diameter = radius * 2.0;
        if (directDistance > diameter || directDistance <= 0) {
            throw new IllegalArgumentException("Illegal value of directDistance/readius");
        }
        double arcLength = Math.round(diameter * Math.asin(directDistance / diameter) * 10.0) / 10.0;
        setDistance(arcLength);
    }
}
