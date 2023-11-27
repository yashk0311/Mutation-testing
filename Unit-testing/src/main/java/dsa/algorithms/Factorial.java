package dsa.algorithms;

public class Factorial {
    public int getIterative(int n) {
        validateInput(n);

        int result = 1;
        for (int i = n; i >= 2; i--) {
            result *= i;
        }
        return result;
    }

    public int getRecursive(int n) {
        validateInput(n);

        if (n == 0) {
            return 1;
        } else {
            return n * getRecursive(n - 1);
        }
    }

    public int getTailRecursive(int n) {
        validateInput(n);
        return getTailRecursiveInner(n, 1);
    }

    private int getTailRecursiveInner(int n, int acc) {
        if (n == 0) {
            return acc;
        } else {
            return getTailRecursiveInner(n - 1, acc * n);
        }
    }

    private void validateInput(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers factorial is not defined.");
        }
    }
}
