package org.example.my_patterns.strategy.ducks;

import org.example.my_patterns.strategy.Duck;

public class DomesticDuck extends Duck {
    @Override
   public void display() {
        System.out.println("Домашняя утка");
    }
}
