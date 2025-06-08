package org.example.my_patterns.factoryClass.animals;

import org.example.my_patterns.factoryClass.Animal;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("гав-гав");
    }
}
