package com.example.lesson2;

import java.util.Scanner;
import java.util.ArrayList;

public class AdvancedFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        long n = Long.valueOf(split[0]);
        long result = divideFibonacci(Long.valueOf(split[0]), Long.valueOf(split[1]));
        System.out.println(result);
    }

    private static long divideFibonacci(long n, long m) {
        ArrayList<Long> values = getFibonacciModValues(m);
        int pizanoPeriod = values.size() - 2;
        int index = (int) (n % pizanoPeriod);
        return values.get(index);
    }

    private static ArrayList<Long> getFibonacciModValues(long m) {
        ArrayList<Long> values = new ArrayList<Long>();
        values.add(0L);
        values.add(1L);
        for (int i = 2; i < 6*m; i++) {
            values.add((values.get(i - 1) + values.get(i - 2)) % m);
            if (values.get(i) == 1 && values.get(i - 1) == 0) {
                break;
            }
        }
        return values;
    }
}

