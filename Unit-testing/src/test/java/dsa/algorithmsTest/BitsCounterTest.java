package dsa.algorithmsTest;
import dsa.algorithms.BitsCounter;
import dsa.algorithms.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BitsCounterTest {
    BitsCounter bc = new BitsCounter();
    @Test public void tc1() {
        assertEquals(1, bc.countBitsToOneBasedOnString(1));
    }

    @Test public void tc2() {
        assertEquals(1, bc.countBitsToOneBasedOnString(2));
    }

    @Test public void tc3() {
        assertEquals(3, bc.countBitsToOneBasedOnBinaryOperators(7));
    }

    @Test public void tc4() {
        assertEquals(7, bc.countBitsToOneBasedOnBinaryOperators(1990));
    }

    @Test public void tc1_BinaryOperator() {
        assertEquals(1, bc.countBitsToOneBasedOnBinaryOperators(1));
    }

    @Test public void tc2_BinaryOperator() {
        assertEquals(1, bc.countBitsToOneBasedOnBinaryOperators(2));
    }

    @Test public void tc3_BinaryOperator() {
        assertEquals(3, bc.countBitsToOneBasedOnBinaryOperators(7));
    }

    @Test
    public void Negative_BinaryOperator() {
        assertEquals(30, bc.countBitsToOneBasedOnBinaryOperators(-7));
    }

    @Test
    public void tc0() {
        assertEquals(0, bc.countBitsToOneBasedOnBinaryOperators(0));
    }

    @Test
    public void tc0_KernighanMethod() {
        assertEquals(0, BitsCounter.countNumberOfBitsLogN(0));
    }

    @Test
    public void Negative_KernighanMethod() {
        assertEquals(30, BitsCounter.countNumberOfBitsLogN(-7));
    }

    @Test public void tc_KernighanMethod() {
        assertEquals(3, bc.countBitsToOneBasedOnBinaryOperators(7));
    }
}
