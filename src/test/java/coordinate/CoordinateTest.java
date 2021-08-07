package coordinate;

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
}
