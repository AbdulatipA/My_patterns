package org.example.my_patterns.factoryClass.animals;

import org.example.my_patterns.factoryClass.Animal;

public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("мяу-мяу");
    }
}
