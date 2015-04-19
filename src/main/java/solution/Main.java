package solution;

import clojure.lang.RT;
import clojure.lang.Var;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int max = 4_000_000;
        long a, b;

        // Load the Clojure script
        RT.loadResourceScript("fibonacci.clj");
        // Get a reference to the fib-sum-ev function.
        Var fib = RT.var("user", "fib-sum-ev");

        Solution solution = new Solution();


        a = System.nanoTime();
        System.out.println("simple solution: sum = " + solution.algorithm1(max));
        b = System.nanoTime();
        System.out.println("TIME : " + (b - a));

        a = System.nanoTime();
        System.out.println("optimized solution: sum = " + solution.algorithm2(max));
        b = System.nanoTime();
        System.out.println("TIME : " + (b - a));

        a = System.nanoTime();
        System.out.println("recursive solution: sum = " + solution.algorithm3(max));
        b = System.nanoTime();
        System.out.println("TIME : " + (b - a));

        a = System.nanoTime();
        System.out.println("clojure function: sum = " + fib.invoke(max));
        b = System.nanoTime();
        System.out.println("TIME : " + (b - a));

    }
}
