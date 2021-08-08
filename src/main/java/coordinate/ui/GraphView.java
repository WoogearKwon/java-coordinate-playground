package coordinate.ui;

import coordinate.Coordinate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static coordinate.Const.MAX_COORDINATE;

public class GraphView {

    public static void printGraph(double distance, List<Coordinate> coordinates) {
        StringBuilder builder = new StringBuilder();

        for (int y = MAX_COORDINATE; y >= 0; y--) {
            drawZeroX(builder, y);
            drawCoordinate(builder, y, coordinates);
        }

        System.out.println(builder.toString());
        System.out.println("두 점 사이의 거리는 " + distance);
    }

    private static void drawZeroX(StringBuilder builder, int y) {
        if (y == 0) {
            drawZeroY(builder);
            drawBelowY(builder);
            return;
        }

        if (y < 10) {
            builder.append(" ");
        }

        if (y % 2 == 0) {
            builder.append(y)
                    .append("|");
            return;
        }

        if (y >= 10) {
            builder.append(" ");
        }

        builder.append(" ")
                .append("|");
    }

    private static void drawZeroY(StringBuilder builder) {
        builder.append(" ")
                .append(" ")
                .append("+");

        for (int i = 0; i < MAX_COORDINATE; i++) {
            builder.append(" ")
                    .append("-");
        }

        builder.append("\n");
    }

    private static void drawBelowY(StringBuilder builder) {
        builder.append(" ");

        for (int i = 0; i <= MAX_COORDINATE; i = i + 2) {
            if (i < 10) {
                builder.append(" ");
            }
            builder.append(i)
                    .append(" ")
                    .append(" ");
        }
    }

    private static void drawCoordinate(StringBuilder builder, int y, List<Coordinate> coordinates) {
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

    private static void findX(Coordinate coordinate, int y, ArrayList<Integer> pointXs) {
        if (y == coordinate.getY()) {
            pointXs.add(coordinate.getX());
        }
    }

    private static void drawX(StringBuilder builder, List<Integer> pointXs, int i) {
        if (i == 0) {
            drawSpaces(pointXs.get(i), builder);
            drawDot(builder);
            return;
        }

        drawSpaces(pointXs.get(i) - pointXs.get(i - 1) - 1, builder);
        drawDot(builder);
    }

    private static void drawSpaces(int x, StringBuilder builder) {
        for (int i = 0; i < x; i++) {
            builder.append(" ")
                    .append(" ");
        }
    }

    private static void drawDot(StringBuilder builder) {
        builder.append("*");
    }
}
