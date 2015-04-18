package solution;

public class Solution {

    /**
     * Simple and slow solution.
     * it is needed just to compare with others.
     * @param maxValue values of the fibonacci sequence do not exceed
     * value of this param
     * @return the sum of the even-valued terms.
     */
    public long algorithm1(int maxValue) {
        int a = 1;
        int b = 2;
        long sum = 0;
        int temp;
        while (b <= maxValue) {
            if(b % 2 == 0) {
                sum += b;
                System.out.print(b + " ");
            }
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
     * @return the sum of the even-valued terms.
     */
    public long algorithm2(int maxValue) {
        int a = 1;
        int b = 2;
        long sum = 0;
        while (b <= maxValue) {
            System.out.print(b + " ");
            sum += b;
            b = 2 * a + 3 * b;
            a = (2 * b - a) / 3;
        }
        return sum;
    }

    /**
     * Recursive solution. The algorithm is the same as {@code algorithm2}
     * @param maxValue values of the fibonacci sequence do not exceed
     * value of this param
     * @return the sum of the even-valued terms.
     */
    public long algorithm3(int maxValue) {
        int a = 1;
        int b = 2;
        return recursiveFibonacci(maxValue, a, b);
    }

    /**
     *
     * @param maxValue
     * @param a element with index n-4
     * @param b element with index n-3
     * @return
     */
    public static long recursiveFibonacci(int maxValue, int a, int b) {
        if (b <= maxValue) {
            System.out.print(b + " ");
            long sum = b;
            b = 2 * a + 3 * b;
            a = (2 * b - a) / 3;
            return sum + recursiveFibonacci(maxValue, a, b);
        }
        return 0;
    }

}
