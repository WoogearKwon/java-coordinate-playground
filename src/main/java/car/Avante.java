package car;

public class Avante extends Car {

    public static final int DISTANCE_PER_METER = 15;

    public Avante(int tripDistance) {
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
