package com.example.lesson2;

/**
 * Created by solina on 18.02.2018.
 */
public class FibonacciPractice {

    private void run(int n) {
        System.out.println(n + ": " + fibonacci(n));
    }

    private long fibonacci(long n) {
        if (n < 2) return n;
        long a = 0;
        long b = 1;
        for (int i = 1; i < n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            long start = System.currentTimeMillis();
            new FibonacciPractice().run(i);
            long end = System.currentTimeMillis();
            System.out.println(end - start + " ms");
        }
    }
}
