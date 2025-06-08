package org.example.my_patterns.strategy;

import org.example.my_patterns.strategy.flying.FlyBehavior;
import org.example.my_patterns.strategy.quack.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public void swim(){
        System.out.println("я умею плавать");
    }
    public abstract void display();


    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
