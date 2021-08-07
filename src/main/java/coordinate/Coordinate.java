package coordinate;

public class Coordinate {
    private final static int MAX_NUM = 24;

    private final int x;
    private final int y;

    public Coordinate(String inputCoordinate) {
        String[] inputNumbers = inputCoordinate
                .replaceAll("\\s+","")
                .split(",");

        this.x = Integer.parseInt(inputNumbers[0]);
        this.y = Integer.parseInt(inputNumbers[1]);

        if (x > MAX_NUM || y > MAX_NUM) {
            throw new IllegalArgumentException("Coordinate number cannot be bigger than 24");
        }
    }

    @Override
    public String toString() {
        return "Coordinate{" + "x=" + x + ", y=" + y + '}';
    }
}
