package coordinate;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CoordinateTest {

    @Test
    void create() {
        Coordinate coordinate = new Coordinate("23, 10");
        assertThat(coordinate.toString()).isEqualTo("Coordinate{x=23, y=10}");
    }

    @Test
    void maxError() {
        assertThatThrownBy(() -> {
            Coordinate coordinate = new Coordinate("26, 10");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void distanceX() {
        Coordinate coordinate1 = new Coordinate("10, 10");
        Coordinate coordinate2 = new Coordinate("20, 10");

        assertThat(coordinate1.getDistanceX(coordinate2)).isEqualTo(10);
    }

    @Test
    void distanceY() {
        Coordinate coordinate1 = new Coordinate("10, 10");
        Coordinate coordinate2 = new Coordinate("10, 20");

        assertThat(coordinate1.getDistanceY(coordinate2)).isEqualTo(10);
    }

    @Test
    void distance() {
        Coordinate coordinate1 = new Coordinate("1, 1");
        Coordinate coordinate2 = new Coordinate("2, 2");

        assertThat(coordinate1.getDistance(coordinate2)).isEqualTo(1.414, Offset.offset(0.009));
    }
}
