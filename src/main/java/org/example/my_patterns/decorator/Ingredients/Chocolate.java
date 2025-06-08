package org.example.my_patterns.decorator.Ingredients;

import org.example.my_patterns.decorator.Beverage;
import org.example.my_patterns.decorator.BeverageDecorator;

public class Chocolate extends BeverageDecorator {

    public Chocolate(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", Chocolate";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.7;
    }
}
