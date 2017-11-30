package com.example.lesson2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n;
        do {
            System.out.print("Please input number: ");
            n = scanner.nextLine();
            if (n.equals("q")) {
                break;
            }
            try {
                Integer i = Integer.valueOf(n);
                if (i < 0) {
                    System.out.println("Please input positive number");
                } else {
                    System.out.println(calculateFibonacci(i));
                }
            } catch (NumberFormatException e) {
                System.out.println("Only number or 'q' to exit");
            }
        } while (!n.equals("q"));
    }

    private static long calculateFibonacci(int n) {
        switch (n) {
            case 0: return 0;
            case 1: return 1;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}
