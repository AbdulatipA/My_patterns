package org.example.my_patterns.decorator.Ingredients;

import org.example.my_patterns.decorator.Beverage;
import org.example.my_patterns.decorator.BeverageDecorator;

public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + "Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
