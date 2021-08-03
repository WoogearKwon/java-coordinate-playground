public class Sonata extends Car {
    private final int distancePerLister = 10;

    public Sonata(int tripDistance) {
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
