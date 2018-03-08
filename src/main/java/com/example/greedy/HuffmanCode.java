package com.example.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HuffmanCode {

    List<PriorityQueue> queue = new ArrayList<>();

    class PriorityQueue {
        char c;
        int f;

        public void insert(char c, int f) {
            queue.put(c, f);
        }

        public PriorityQueue extractMin() {
            Map.Entry<Character, Integer> min = null;
            for (Map.Entry<Character, Integer> entry : queue) {
                if (min == null || min.getValue() > entry.getValue()) {
                    min = entry;
                }
            }
            return min;
        }
    }


    private void run(String input) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        new HuffmanCode().run(input);
    }
}
