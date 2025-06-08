package org.example.my_patterns.decorator;

public class CoffeeWithSugar implements Beverage{
    @Override
    public String description() {
        return "Коффе с сахаром";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
