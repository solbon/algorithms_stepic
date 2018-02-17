package com.example.lesson3;

import java.util.Scanner;

/**
 * Created by solina on 17.02.2018.
 */
public class NOD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);
        System.out.println(findNod(a, b));
    }

    private static long findNod(long a, long b) {
        if (a == 0) {
            if (b == 0) {
                return 0L;
            }
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return findNod(b, a % b);
        }
        return findNod(a, b % a);
    }
}
