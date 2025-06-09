package org.example.my_patterns.abstractFactory.real;

import org.example.my_patterns.abstractFactory.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Кнопа виндовс");
    }
}
