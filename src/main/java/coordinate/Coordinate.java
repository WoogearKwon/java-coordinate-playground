package coordinate;

import static coordinate.Const.MAX_COORDINATE;

public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(String inputCoordinate) {
        String[] inputNumbers = inputCoordinate
                .replaceAll("\\s+","")
                .split(",");

        this.x = Integer.parseInt(inputNumbers[0]);
        this.y = Integer.parseInt(inputNumbers[1]);

        if (x > MAX_COORDINATE || y > MAX_COORDINATE) {
            throw new IllegalArgumentException("Coordinate number cannot be bigger than 24");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance(Coordinate coordinate) {
        return Math.sqrt((Math.pow(getDistanceX(coordinate), 2))
                + (Math.pow(getDistanceY(coordinate), 2)));
    }

    public double getDistanceX(Coordinate coordinate) {
        return Math.abs(getX() - coordinate.getX());
    }

    public double getDistanceY(Coordinate coordinate) {
        return Math.abs(getY() - coordinate.getY());
    }

    @Override
    public String toString() {
        return "Coordinate{" + "x=" + x + ", y=" + y + '}';
    }
}
