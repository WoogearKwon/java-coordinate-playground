package coordinate;

import java.util.ArrayList;
import java.util.Collections;
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

        for (int y = MAX_COORDINATE; y >= 0; y--) {
            drawZeroX(builder, y);
            drawCoordinate(builder, y);
        }

        System.out.println(builder.toString());
        System.out.println("두 점 사이의 거리는 " + getDistance());
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
            builder.append(" -");
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
        StringBuilder pointBuilder = new StringBuilder();
        ArrayList<Integer> pointXs = new ArrayList<>();

        for (Coordinate coordinate : coordinates) {
            findX(coordinate, y, pointXs);
        }

        Collections.sort(pointXs);

        for (int i = 0; i < pointXs.size(); i++) {
            drawX(pointBuilder, pointXs, i);
        }

        builder.append(pointBuilder);
        builder.append("\n");
    }

    private void findX(Coordinate coordinate, int y, ArrayList<Integer> pointXs) {
        if (y == coordinate.getY()) {
            pointXs.add(coordinate.getX());
        }
    }

    private void drawX(StringBuilder builder, List<Integer> pointXs, int i) {
        if (i == 0) {
            drawSpaces(pointXs.get(i), builder);
            drawDot(builder);
            return;
        }

        drawSpaces(pointXs.get(i) - pointXs.get(i - 1) - 1, builder);
        drawDot(builder);
    }

    private void drawSpaces(int x, StringBuilder builder) {
        for (int i = 0; i < x; i++) {
            builder.append("  ");
        }
    }

    private void drawDot(StringBuilder builder) {
        builder.append("*");
    }

    private double getDistance() {
        double distanceX = coordinates.get(0).getX() - coordinates.get(1).getX();
        double distanceY = coordinates.get(0).getY() - coordinates.get(1).getY();

        return Math.sqrt((Math.pow(distanceX, 2) + Math.pow(distanceY, 2)));
    }
}
