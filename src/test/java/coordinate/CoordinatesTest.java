package coordinate;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CoordinatesTest {

    @Test
    void create() {
        Coordinate coordinateOne = new Coordinate("10, 3");
        Coordinate coordinateTwo = new Coordinate("10, 12");

        List<Coordinate> list = new ArrayList<>();
        list.add(coordinateOne);
        list.add(coordinateTwo);

        Coordinates coordinates = new Coordinates(list);
        assertThat(coordinates.getItemSize()).isEqualTo(2);
    }

    @Test
    void itemSize() {
        List<Coordinate> list = new ArrayList<>();

        assertThatThrownBy(() -> {
            Coordinates coordinates = new Coordinates(list);
        }).isInstanceOf(IllegalStateException.class);
    }
}
