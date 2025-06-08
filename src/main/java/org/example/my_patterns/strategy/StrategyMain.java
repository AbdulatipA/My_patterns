package org.example.my_patterns.strategy;

import org.example.my_patterns.strategy.quack.QuackNoWay;
import org.example.my_patterns.strategy.ducks.RubberDuck;
import org.example.my_patterns.strategy.flying.FlyNoWay;
import org.example.my_patterns.strategy.ducks.MallardDuck;
import org.example.my_patterns.strategy.flying.FlyWithWings;

public class StrategyMain {
    public static void main(String[] args) {
        Duck mallarDuck = new MallardDuck();
        mallarDuck.display();
        mallarDuck.setFlyBehavior(new FlyNoWay());
        mallarDuck.performFly();


        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.setQuackBehavior(new QuackNoWay());
        rubberDuck.performQuack();

        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.performFly();
    }
}
