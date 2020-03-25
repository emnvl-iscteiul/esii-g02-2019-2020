import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pt.iscte.esii.Calc;


class CalcTest {
    Calc calc;

    @BeforeEach
    void setUp() {
        // Creates a fresh instance of the object before every test
        calc = new Calc();
    }

    @AfterEach
    void tearDown() {
        // Disposes the Calc object and schedules GC
        calc = null;
        System.gc();
    }

    @Test
    void sum() {
        assertEquals(2, calc.sum(2).result());
    }

    @Test
    void sub() {
        assertEquals(0, calc.sum(2).sub(2).result());
    }

    @Test
    void div() {
        assertEquals(1, calc.sum(2).div(2).result());
    }

    @Test
    void mul() {
        assertEquals(4, calc.sum(2).mul(2).result());
    }

    @Test
    void clear() {
        assertEquals(0, calc.sum(123).sub(12).clear().result());
    }

    @Test
    void result() {
        assertEquals(0, calc.result());
    }

    @Test
    void testEquals() {
        Calc temp = new Calc();
        assertEquals(temp, calc);
    }

    @Test
    void testToString() {
        assertEquals("0.0", calc.toString());
    }
}