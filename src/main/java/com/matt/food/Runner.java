package com.matt.food;

public class Runner {
    public static void main(String[] args) {
        Food food = new Food();
        System.out.println(food.getBreakfast());
        for (int i = 0; i < 2; i++) {
            System.out.println(food.getFood());

        }
    }
}
