package org.example.my_patterns.simpleFactory.animals;

import org.example.my_patterns.simpleFactory.Animal;

public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("мяу-мяу");
    }
}
