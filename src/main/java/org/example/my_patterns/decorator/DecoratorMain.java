package org.example.my_patterns.decorator;

import org.example.my_patterns.decorator.Ingredients.Chocolate;
import org.example.my_patterns.decorator.Ingredients.Milk;
import org.example.my_patterns.decorator.Ingredients.Sugar;

public class DecoratorMain {
    public static void main(String[] args) {
        Beverage order = new Espresso();

        order = new Milk(order);
        order = new Chocolate(order);
        order = new Sugar(order);

        System.out.println(order.description());
        System.out.println("Итого: " + order.cost());

        System.out.println("///////////////////////");

        Beverage order2 = new CoffeeWithSugar();

        order2 = new Sugar(order2);
        order2 = new Chocolate(order2);

        System.out.println(order2.description());
        System.out.println("Итого: " + order2.cost());
    }
}
