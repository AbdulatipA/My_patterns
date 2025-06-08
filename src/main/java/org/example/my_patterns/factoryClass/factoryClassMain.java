package org.example.my_patterns.factoryClass;

public class factoryClassMain {
    public static void main(String[] args) {
        Animal a = AnimalFactory.createAnimal("dog");
        a.speak();
    }
}
