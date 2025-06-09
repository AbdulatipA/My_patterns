package org.example.my_patterns.abstractFactory.real;

import org.example.my_patterns.abstractFactory.Window;

public class MacOsWindow implements Window {
    @Override
    public void open() {
        System.out.println("Окно макос");
    }
}
