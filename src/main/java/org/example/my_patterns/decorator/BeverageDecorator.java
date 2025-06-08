package org.example.my_patterns.decorator;

public abstract class BeverageDecorator implements Beverage{
    public Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
