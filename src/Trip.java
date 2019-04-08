
public abstract class Trip {
    private static int tripsCounter;
    protected String type;
    private int tripNumber;
    private int speed;        // km/h
    private int stopoverTime; // minutes
    private double distance;  // km
    private int tripTime;     // minutes

    public Trip(int speed, int stopoverTime) {
        tripNumber = ++tripsCounter;
        setSpeed(speed);
        this.stopoverTime = stopoverTime;
    }

    public int getTripNumber() {
        return tripNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) throw new IllegalArgumentException("Illegal value of speed");
        this.speed = speed;
    }

    public int getStopoverTime() {
        return stopoverTime;
    }

    public void setStopoverTime(int stopoverTime) {
        this.stopoverTime = stopoverTime;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(double distance, int speed, int stopoverTime) {
        this.tripTime = (int) (60 * distance / speed + stopoverTime);
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        String field = String.format("%02d %-8s%8d%9.1f%6d%9d",
                tripNumber, type, tripTime, distance, speed, stopoverTime);
        return field;
    }
}

