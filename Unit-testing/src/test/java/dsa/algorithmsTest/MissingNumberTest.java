package dsa.algorithmsTest;
import static org.junit.jupiter.api.Assertions.*;

import dsa.algorithms.MissingNumber;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MissingNumberTest {
    MissingNumber mn = new MissingNumber();

    @Test public void NullInstances() {
        try{
            mn.find(null);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void EmptyArrays() {
        try{
            mn.find(new int[0]);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test public void tc1() {
        int[] numbers = { 0, 1, 2, 4 };

        int missingNumber = mn.find(numbers);

        assertEquals(3, missingNumber);
    }
    @Test public void tc2() {
        int[] numbers = { 3, 1, 2, 4, 5, 0 ,7 };

        int missingNumber = mn.find(numbers);

        assertEquals(6, missingNumber);
    }
}
