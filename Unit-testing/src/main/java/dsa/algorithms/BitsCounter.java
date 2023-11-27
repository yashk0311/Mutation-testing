package dsa.algorithms;

public class BitsCounter {
    public int countBitsToOneBasedOnString(int n) {
        int result = 0;
        String binaryNumber = Integer.toBinaryString(n);
        for (char c : binaryNumber.toCharArray()) {
            result += c == '1' ? 1 : 0;
        }
        return result;
    }
    public int countBitsToOneBasedOnBinaryOperators(int n) {
        int result = 0;
        while (n != 0) {
            result += (n & 1) == 1 ? 1 : 0;
            n = n >>> 1;
        }
        return result;
    }

    public static int countNumberOfBitsLogN(int x) {
        int result = 0;
        while (x != 0) {
            x &= (x - 1);
            result++;
        }
        return result;
    }
}
