package org.example.my_patterns.factoryMethod.pizzas;

import org.example.my_patterns.factoryMethod.Pizza;

public class Pepperoni implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Пицца Пеперони");
    }
}
