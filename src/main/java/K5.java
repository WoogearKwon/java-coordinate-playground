public class K5 extends Car {

    public K5(int tripDistance) {
        super(tripDistance);
    }

    @Override
    double getDistancePerLiter() {
        return 13;
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
