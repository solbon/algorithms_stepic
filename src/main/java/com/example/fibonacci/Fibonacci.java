package com.example.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(lastDigitFibonacci(n));
    }

    private static long calculateFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    private static long fastFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    private static int lastDigitFibonacci(int n) {
        if (n < 2) {
            return n;
        }
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 10;
        }
        return arr[n];
    }
}
