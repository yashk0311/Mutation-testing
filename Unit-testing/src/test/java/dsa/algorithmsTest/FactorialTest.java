package dsa.algorithmsTest;

import dsa.algorithms.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FactorialTest {

    Factorial fact = new Factorial();
    @Test public void NegativeIntegers_Iterative() {
        try {
            fact.getIterative(-1);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    @Test public void Zero_Iterative() {
        int result = fact.getIterative(0);

        assertEquals(1, result);
    }

    @Test public void Iterative() {
        int result = fact.getIterative(5);

        assertEquals(120, result);
    }

    @Test public void Iterative1() {
        int result = fact.getIterative(7);

        assertEquals(5040, result);
    }

    @Test public void NegativeIntegers_Recursive() {
        try {
            fact.getRecursive(-1);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    @Test public void Zero_Recursive() {
        int result = fact.getRecursive(0);

        assertEquals(1, result);
    }

    @Test public void Recursive1() {
        int result = fact.getRecursive(5);

        assertEquals(120, result);
    }

    @Test public void Recursive2() {
        int result = fact.getRecursive(7);

        assertEquals(5040, result);
    }

    @Test public void NegativeIntegers_TailRecursive() {
        try {
            fact.getTailRecursive(-1);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void Zero_TailRecursive() {
        int result = fact.getTailRecursive(0);

        assertEquals(1, result);
    }

    @Test public void TailRecursive1() {
        int result = fact.getTailRecursive(5);

        assertEquals(120, result);
    }

    @Test public void TailRecursive2() {
        int result = fact.getTailRecursive(7);

        assertEquals(5040, result);
    }
}
