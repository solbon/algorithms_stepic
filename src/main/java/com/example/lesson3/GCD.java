package com.example.lesson3;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by solina on 18.02.2018.
 */
public class GCD {
    private int gcd(int a, int b) {
        int res = 0;
        for (int i = 1; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                res = i;
            }
        }
        return res;
    }

    private int gcdAlina(int a, int b) {
        int res = 1;
        for (int i = 2; i < Math.min(a, b); i++) {
            if (max(a, b) % min(a, b) == 0) return min(a, b);
            if (min(a, b) % i == 0) {
                int c = min(a, b) / i;
                System.out.println(i + ": " + c + " " + a + " " + b);
                if (max(a, b) % c == 0) return c;
            }
        }
        return res;
    }

    private static long gcdMod(long a, long b) {
        System.out.println(a + " " + b);
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcdMod(b, a % b);
        }
        return gcdMod(a, b % a);
    }

    private void run() {
//        System.out.println(gcd(1343221 * 324, 242342 * 324)); //400 ms in naive algorithm
        System.out.println(gcdAlina(1343221 * 324, 242342 * 324)); //20 ms in Alina's algorithm
//        System.out.println(gcdAlina(1343221324, 242342324)); //20 ms in Alina's algorithm
//        System.out.println(gcdMod(1343221 * 324, 242342 * 324)); //1 ms in MOD algorithm
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new GCD().run();
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}
