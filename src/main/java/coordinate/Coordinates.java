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

    public double getDistance() {
        return coordinates.get(0).getDistance(coordinates.get(1));
    }
}
