package dsa.algorithmsTest;
import dsa.algorithms.StrassenMM;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StrassenMMTest {
    StrassenMM smm = new StrassenMM();

    @Test public void SMM_Test2x2() {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] expResult = {{19, 22}, {43, 50}};
        int[][] actResult = smm.multiply(A, B);
        Assertions.assertArrayEquals(expResult, actResult);
    }

    @Test public void SMM_Test4x4() {
        int[][] A = {{1, 2, 5, 4}, {9, 3, 0, 6}, {4, 6, 3, 1}, {0, 2, 0, 6}};
        int[][] B = {{1, 0, 4, 1}, {1, 2, 0, 2}, {0, 3, 1, 3}, {1, 8, 1, 2}};
        int[][] expResult = {{7, 51, 13, 28}, {18, 54, 42, 27}, {11, 29, 20, 27}, {8, 52, 6, 16}};
        int[][] actResult = smm.multiply(A, B);
        Assertions.assertArrayEquals(expResult, actResult);
    }

    @Test public void SMM_NegativeNumber4x4() {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] B = {{1, -2, -3, 4}, {4, -3, -2, 1}, {5, -6, -7, 8}, {8, -7, -6, -5}};
        int[][] expResult = {{56, -54, -52, 10}, {128, -126, -124, 42}, {200, -198, -196, 74}, {272, -270, -268, 106}};
        int[][] actResult = smm.multiply(A, B);
        Assertions.assertArrayEquals(expResult, actResult);
    }
    @Test public void InvalidInput(){
        try{
            int[][] A = {{1, 2, 3}, {5, 6, 7}, {1, 2, 3}};
            int[][] B = {{1, -2, -3, 4}, {4, -3, -2, 1}, {5, -6, -7, 8}, {8, -7, -6, -5}};
//            int[][] expResult = {{56, -54, -52, 10}, {128, -126, -124, 42}, {200, -198, -196, 74}, {272, -270, -268, 106}};
            smm.multiply(A, B);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
