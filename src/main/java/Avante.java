public class Avante extends Car {
    private final int distancePerLister = 15;

    public Avante(int tripDistance) {
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
