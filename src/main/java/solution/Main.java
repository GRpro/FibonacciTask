package solution;


public class Main {

    public static void main(String[] args) {

        int max = 4_000_000;

        Solution solution = new Solution();

        long a, b;

        System.out.println("*********************ALGO1***********************");
        a = System.nanoTime();
        System.out.println("ALGO1: sum = " + solution.algorithm1(max));
        b = System.nanoTime();
        System.out.println(" TIME : " + (b - a));


        System.out.println("*********************ALGO2***********************");

        a = System.nanoTime();
        System.out.println("ALGO2: sum = " + solution.algorithm2(max));
        b = System.nanoTime();
        System.out.println(" TIME : " + (b - a));


        System.out.println("*********************ALGO3***********************");

        a = System.nanoTime();
        System.out.println("ALGO3: sum = " + solution.algorithm3(max));
        b = System.nanoTime();
        System.out.println(" TIME : " + (b - a));


    }
}
