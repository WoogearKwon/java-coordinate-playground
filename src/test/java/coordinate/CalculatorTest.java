package coordinate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    void create() {
        Calculator calculator = new Calculator("(10,10)-(14,15)");
        assertThat(calculator.getDistance()).isEqualTo(6.403, offset(0.009));
    }

    @Test
    void wrongInput() {
        assertThatThrownBy(() -> {
            Calculator calculator = new Calculator("(10,10)(14,15)");
        }).isInstanceOf(IllegalStateException.class);
    }
}
