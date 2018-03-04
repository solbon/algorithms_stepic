package com.example.greedy;

import java.util.Scanner;

public class NaturalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        new NaturalSum().run(n);
    }

    private void run(int n) {
        findNaturalSum(n);
    }

    private void findNaturalSum(int n) {
        int remain = n;
        int prev = 0;
        int last = 1;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (remain - i > i) {
                remain -= i;
                count++;
            } else {
                prev = i - 1;
                last = remain;
                break;
            }
        }

        System.out.println(count);
        for (int i = 1; i <= prev; i++) {
            System.out.print(i + " ");
        }
        System.out.println(last);
    }
}
