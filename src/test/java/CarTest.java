import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void createCarsTest() {
        Sonata sonata = new Sonata(100);
        assertThat(sonata.getName()).isEqualTo("Sonata");
        assertThat(sonata.getDistancePerLiter()).isEqualTo(10);
        assertThat(sonata.getTripDistance()).isEqualTo(100);

        Avante avante = new Avante(120);
        assertThat(avante.getName()).isEqualTo("Avante");
        assertThat(avante.getDistancePerLiter()).isEqualTo(15);
        assertThat(avante.getTripDistance()).isEqualTo(120);

        K5 k5 = new K5(210);
        assertThat(k5.getName()).isEqualTo("K5");
        assertThat(k5.getDistancePerLiter()).isEqualTo(13);
        assertThat(k5.getTripDistance()).isEqualTo(210);
    }
}
