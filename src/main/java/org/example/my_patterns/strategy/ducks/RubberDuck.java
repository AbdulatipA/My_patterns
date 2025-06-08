package org.example.my_patterns.strategy.ducks;

import org.example.my_patterns.strategy.Duck;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
}
