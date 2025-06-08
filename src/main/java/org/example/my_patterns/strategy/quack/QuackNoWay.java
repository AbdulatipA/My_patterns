package org.example.my_patterns.strategy.quack;

public class QuackNoWay implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Я не умею квакать");
    }
}
