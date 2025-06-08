package org.example.my_patterns.simpleFactory;

import org.example.my_patterns.simpleFactory.animals.Cat;
import org.example.my_patterns.simpleFactory.animals.Dog;

public class AnimalFactory {
    static Animal createAnimal(String type) {
        return switch (type) {
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            default -> throw new IllegalArgumentException("Неизвестное животное");
        };
    }
}
