package org.example.my_patterns.strategy.flying;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Я не умею лелать");
    }
}
