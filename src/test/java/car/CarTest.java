package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    void createCarsTest() {
        Sonata sonata = new Sonata(100);
        assertThat(sonata.getName()).isEqualTo("Sonata");
        assertThat(sonata.getDistancePerLiter()).isEqualTo(10);
        assertThat(sonata.getTripDistance()).isEqualTo(100);
        assertThat(sonata.getChargeQuantity()).isEqualTo(10);

        Avante avante = new Avante(60);
        assertThat(avante.getName()).isEqualTo("Avante");
        assertThat(avante.getDistancePerLiter()).isEqualTo(15);
        assertThat(avante.getTripDistance()).isEqualTo(60);
        assertThat(avante.getChargeQuantity()).isEqualTo(4);

        K5 k5 = new K5(260);
        assertThat(k5.getName()).isEqualTo("K5");
        assertThat(k5.getDistancePerLiter()).isEqualTo(13);
        assertThat(k5.getTripDistance()).isEqualTo(260);
        assertThat(k5.getChargeQuantity()).isEqualTo(20);
    }
}
