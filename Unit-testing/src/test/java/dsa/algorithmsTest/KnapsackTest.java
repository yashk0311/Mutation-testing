package dsa.algorithmsTest;

import static org.junit.jupiter.api.Assertions.*;

import dsa.algorithms.Knapsack;
import org.junit.jupiter.api.Test;

public class KnapsackTest {
    Knapsack kss = new Knapsack();
    @Test public void testKnapsack1() {
        int W = 10;
        int wt [] = {15,16};
        int val [] = {15,25};
        int n = wt.length;
        assertEquals(0, kss.knapSack(W, wt, val, n));
    }

    @Test public void testKnapsack2() {
        int W = 15;
        int wt [] = {15, 60};
        int val [] = {1,7};
        int n = wt.length;
        assertEquals(1, kss.knapSack(W, wt, val, n));
    }

    @Test public void testKnapsack3() {
        int W = 100;
        int wt [] = {1, 1, 101};
        int val [] = {10, 20, 31};
        int n = wt.length;
        assertEquals(30, kss.knapSack(W, wt, val, n));
    }

    @Test public void testKnapsack4() {
        int W4 = 20;
        int wt4 [] = {4, 4, 4, 4, 4, 4};
        int val4 [] = {1, 4, 4, 8, 2, 8};
        int n4 = wt4.length;
        assertEquals(26, kss.knapSack(W4, wt4, val4, n4));
    }

    @Test public void KnapsackWithoutValidation(){
        int W = 20;
        int wt [] = null;
        int val [] = null;
        int n = 1;

        try {
            int result = kss.knapSack(W, wt, val, n);
            // Continue processing result
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
