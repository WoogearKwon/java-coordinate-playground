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

    @Override
    public String toString() {
        return "Coordinate{" + "x=" + x + ", y=" + y + '}';
    }
}
