public class K5 extends Car {
    private final int distancePerLister = 13;

    public K5(int tripDistance) {
        super(tripDistance);
    }

    @Override
    double getDistancePerLiter() {
        return distancePerLister;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return this.getClass().getName();
    }
}
