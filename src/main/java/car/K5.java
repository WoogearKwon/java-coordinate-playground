package car;

public class K5 extends Car {

    public static final int DISTANCE_PER_METER = 13;

    public K5(int tripDistance) {
        super(tripDistance);
    }

    @Override
    double getDistancePerLiter() {
        return DISTANCE_PER_METER;
    }

    @Override
    String getName() {
        return this.getClass().getSimpleName();
    }
}
