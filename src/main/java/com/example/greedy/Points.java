package com.example.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by solina on 18.02.2018.
 */
public class Points {

    private List<Line> lines = new ArrayList<>();
    private List<Integer> points = new ArrayList<>();

    class Line {
        private int x;
        private int y;

        Line(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }


    private void run() {
        addLines();
        calculatePoints();

    }

    private void addLines() {
        lines.add(new Line(4, 7));
        lines.add(new Line(1, 3));
        lines.add(new Line(2, 5));
        lines.add(new Line(5, 6));
    }

    private void calculatePoints() {
        lines.sort(Comparator.comparing(Line::getY));
        points.add(lines.get(0).getY());
        for (int i = 1; i < lines.size(); i++) {
            if (lines.get(i).getX() > points.get(points.size() - 1)) {
                points.add(lines.get(i).getY());
            }
        }
        System.out.println(points.size());
        points.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    private void run2() {
        Scanner scanner = new Scanner(System.in);
        Integer count = Integer.valueOf(scanner.nextLine());
        while (count-- > 0) {
            String input = scanner.nextLine();
            String[] split = input.split(" ");
            lines.add(new Line(Integer.valueOf(split[0]), Integer.valueOf(split[1])));
        }
        lines.sort(Comparator.comparing(Line::getY));
        points.add(lines.get(0).getY()); //1-й надежный шаг
        for (int i = 1; i < lines.size(); i++) {
            if (lines.get(i).getX() > points.get(points.size() - 1)) {
                points.add(lines.get(i).getY());
            }
        }
        System.out.println(points.size());
        points.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Points().run();
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}
