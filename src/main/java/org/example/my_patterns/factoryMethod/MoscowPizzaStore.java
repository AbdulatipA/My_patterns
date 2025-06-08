package org.example.my_patterns.factoryMethod;

import org.example.my_patterns.factoryMethod.pizzas.Margherita;
import org.example.my_patterns.factoryMethod.pizzas.Pepperoni;

public class MoscowPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("pepperoni")) {
            return new Pepperoni();
        } else if (type.equals("cheese")) {
            return new Margherita();
        }
        throw new IllegalArgumentException("Такой пиццы не существует");
    }
}
