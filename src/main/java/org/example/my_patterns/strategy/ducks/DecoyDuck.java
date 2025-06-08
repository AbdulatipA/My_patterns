package org.example.my_patterns.strategy.ducks;

import org.example.my_patterns.strategy.Duck;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("DecoyDuck");
    }

    @Override
    public void swim() {}
}
