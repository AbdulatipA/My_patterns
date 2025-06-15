package org.example.my_patterns.abstractFactory.real;

import org.example.my_patterns.abstractFactory.Button;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Кнопка Linux");
    }
}
