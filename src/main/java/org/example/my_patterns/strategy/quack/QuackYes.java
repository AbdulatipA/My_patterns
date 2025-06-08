package org.example.my_patterns.strategy.quack;

public class QuackYes implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Я умею квакать");
    }
}
