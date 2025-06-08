package org.example.my_patterns.decorator;

public class Espresso implements Beverage{
    @Override
    public String description() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
