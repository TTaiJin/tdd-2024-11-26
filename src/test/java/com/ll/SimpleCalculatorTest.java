package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void t1() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int rs = simpleCalculator.plus(1, 2);

        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 10 = 12")
    public void t2() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int rs = simpleCalculator.plus(2, 10);

        assertEquals(12, rs);
    }

    @Test
    @DisplayName("20 + 10 = 30")
    public void t3() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int rs = simpleCalculator.plus(20, 10);

        assertEquals(30, rs);
    }

    @Test
    @DisplayName("2 * 3 = 6")
    public void t4() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int rs = simpleCalculator.multiply(2, 3);

        assertEquals(6, rs);
    }

    @Test
    @DisplayName("5 - 3 = 2")
    public void t5() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int rs = simpleCalculator.minus(5, 3);

        assertEquals(2, rs);
    }

    @Test
    @DisplayName("5 / 3 = 1")
    public void t6() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int rs = simpleCalculator.divide(5, 3);

        assertEquals(1, rs);
    }

    @Test
    @DisplayName("5 % 3 = 2")
    public void t7() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int rs = simpleCalculator.reminder(5, 3);

        assertEquals(2, rs);
    }

}
