package org.example;

public class KnapsackSource {
    public int knapSack(int W, int wt[], int val[], int n)
            throws IllegalArgumentException {
        if (wt == null || val == null) {
            throw new IllegalArgumentException();
        }
        int i, w;
        int rv[][] = new int[n + 1][W + 1]; // rv means return value

        // Build table rv[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    rv[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    rv[i][w] =
                            Math.max(
                                    val[i - 1] + rv[i - 1][w - wt[i - 1]],
                                    rv[i - 1][w]
                            );
                } else {
                    rv[i][w] = rv[i - 1][w];
                }
            }
        }

        return rv[n][W];
    }
}
