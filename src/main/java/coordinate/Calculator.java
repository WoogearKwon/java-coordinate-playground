package coordinate;

import java.util.Arrays;

public class Calculator {
    private final Coordinates coordinates;

    public Calculator(String input) {
        String[] coordinateInputs = input.replace("(", "")
                .replace(")", "")
                .split("-");

        if (coordinateInputs.length != 2) {
            throw new IllegalStateException("Something went wrong with your coordinate input");
        }

        Coordinate coordinateOne = new Coordinate(coordinateInputs[0]);
        Coordinate coordinateTwo = new Coordinate(coordinateInputs[1]);
        coordinates = new Coordinates(Arrays.asList(coordinateOne, coordinateTwo));
    }

    public double getDistance() {
        return coordinates.getDistance();
    }
}
