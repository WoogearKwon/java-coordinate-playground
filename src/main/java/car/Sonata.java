package car;

public class Sonata extends Car {

    public static final int DISTANCE_PER_METER = 10;

    public Sonata(int tripDistance) {
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
