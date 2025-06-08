package org.example.my_patterns.simpleFactory;

public class SimpleFactoryMain {
    public static void main(String[] args) {
        Animal a = AnimalFactory.createAnimal("dog");
        a.speak();
    }
}
