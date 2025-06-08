package org.example.my_patterns.decorator.Ingredients;

import org.example.my_patterns.decorator.Beverage;
import org.example.my_patterns.decorator.BeverageDecorator;

public class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }
}
