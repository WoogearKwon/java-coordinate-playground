package coordinate;

import coordinate.ui.GraphView;

import java.util.List;

public class Coordinates {
    private final List<Coordinate> coordinates;

    public Coordinates(List<Coordinate> list) {
        if (list.isEmpty() || list.size() < 2) {
            throw new IllegalStateException("Coordinates should have more than two items");
        }

        coordinates = list;
        GraphView.printGraph(getDistance(), coordinates);
    }

    public int getItemSize() {
        return coordinates.size();
    }

    private double getDistance() {
        double distanceX = coordinates.get(0).getX() - coordinates.get(1).getX();
        double distanceY = coordinates.get(0).getY() - coordinates.get(1).getY();

        return Math.sqrt((Math.pow(distanceX, 2) + Math.pow(distanceY, 2)));
    }
}
