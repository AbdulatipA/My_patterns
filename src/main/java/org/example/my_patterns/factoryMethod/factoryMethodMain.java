package org.example.my_patterns.factoryMethod;


public class factoryMethodMain {
    public static void main(String[] args) {
       PizzaStore pizzaStore = new MoscowPizzaStore();

       pizzaStore.orderPizza("cheese");
       pizzaStore.orderPizza("pepperoni");
    }
}
