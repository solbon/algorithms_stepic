package com.example.greedy;

import java.util.*;

/**
 * Created by solina on 22.02.2018.
 */
public class Knapsack {

    private List<Item> items = new ArrayList<>();
    private double knapsackWeight;

    private void init() {
        knapsackWeight = 1;
        items.add(new Item(60, 20));
        items.add(new Item(120, 30));
        items.add(new Item(100, 50));
    }

    private double findMaxCost() {
        items.sort(Comparator.comparing(item -> item.costPerWeight, Comparator.reverseOrder()));
        double totalWeight = 0;
        double totalCost = 0;
        for (Item item : items) {
            double remain = knapsackWeight - totalWeight;
            if (remain == 0) break;
            if (item.weight <= remain) {
                totalWeight += item.weight;
                totalCost += item.cost;
            } else {
                totalCost += item.cost * (remain / item.weight);
                totalWeight = knapsackWeight;
            }
        }
        return totalCost;
    }

    public void run() {
        init();
        System.out.println(findMaxCost());
    }

    public static void main(String[] args) {
        new Knapsack().run();
    }

    class Item {
        double cost;
        double weight;
        double costPerWeight;

        public Item(double cost, double weight) {
            this.cost = cost;
            this.weight = weight;
            this.costPerWeight = cost / weight;
        }
    }



}
