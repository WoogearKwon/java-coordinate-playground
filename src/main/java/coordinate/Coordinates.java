package coordinate;

import java.util.List;

import static coordinate.Const.MAX_COORDINATE;

public class Coordinates {
    private final List<Coordinate> coordinates;

    public Coordinates(List<Coordinate> list) {
        if (list.isEmpty() || list.size() < 2) {
            throw new IllegalStateException("Coordinates should have more than two items");
        }

        coordinates = list;
        printGraph();
    }

    public int getItemSize() {
        return coordinates.size();
    }

    public void printGraph() {
        StringBuilder builder = new StringBuilder();

        for (int i = MAX_COORDINATE; i >= 0; i--) {
            drawZeroX(builder, i);
            drawCoordinate(builder, i);
            builder.append("\n");
        }

        System.out.println(builder.toString());
    }

    private void drawZeroX(StringBuilder builder, int i) {
        if (i == 0) {
            drawZeroY(builder);
            builder.append("\n");
            drawBelowY(builder);
            return;
        }

        if (i < 10) {
            builder.append(" ");
        }

        if (i % 2 == 0) {
            builder.append(i).append("|");
            return;
        }

        if (i >= 10) {
            builder.append(" ");
        }

        builder.append(" |");
    }

    private void drawZeroY(StringBuilder builder) {
        builder.append("  +");
        for (int i = 0; i < MAX_COORDINATE; i++) {
            builder.append(" _");
        }
    }

    private void drawBelowY(StringBuilder builder) {
        builder.append(" ");
        for (int i = 0; i <= MAX_COORDINATE; i = i + 2) {
            if (i < 10) {
                builder.append(" ");
            }
            builder.append(i).append("  ");
        }
    }

    private void drawCoordinate(StringBuilder builder, int y) {
        for (Coordinate coordinate : coordinates) {
            findX(coordinate, builder, y);
        }
    }

    private void findX(Coordinate coordinate, StringBuilder builder, int y) {
        if (y == coordinate.getY()) {
            drawSpaces(builder, coordinate.getX());
            builder.append("*");
        }
    }

    private void drawSpaces(StringBuilder builder, int x) {
        for (int i = 0; i < x; i++) {
            builder.append("  ");
        }
    }
}
