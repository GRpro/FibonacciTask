package solution;

public class Solution {

    /**
     * Simple and slow solution.
     * it is needed just to compare with others.
     * @param maxValue values of the fibonacci sequence do not exceed
     * value of this param
     * @return sum of even-valued terms
     */
    public long algorithm1(int maxValue) {
        int a = 1;
        int b = 2;
        long sum = 0;
        int temp;
        while (b <= maxValue) {
            if(b % 2 == 0)
                sum += b;
            temp = a + b;
            a = b;
            b = temp;
        }
        return sum;
    }

    /**
     * One of the best solutions on my opinion.
     * @param maxValue values of the fibonacci sequence do not exceed
     * value of this param
     * @return sum of even-valued terms
     */
    public long algorithm2(int maxValue) {
        int a = 1;
        int b = 2;
        long sum = 0;
        while (b <= maxValue) {
            sum += b;
            b = 2 * a + 3 * b;
            a = (2 * b - a) / 3;
        }
        return sum;
    }

    /**
     * Recursive solution.
     * @param maxValue values of the fibonacci sequence do not exceed
     * value of this param
     * @return sum of even-valued terms
     */
    public long algorithm3(int maxValue) {
        return recursiveFibonacci(maxValue, 1, 2);
    }

    public static long recursiveFibonacci(int maxValue, int a, int b) {
        return b > maxValue ? 0 : b + recursiveFibonacci(maxValue, a + 2 * b, 2 * a + 3 * b);
    }

}
