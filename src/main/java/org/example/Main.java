package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        FoodFinder foodFinder = new FoodFinder();
        List<String> ingredients = List.of("eggs ", "salt", "pepper");
        foodFinder.createReceipe(ingredients);
        System.out.println("Hello world!");
    }
}