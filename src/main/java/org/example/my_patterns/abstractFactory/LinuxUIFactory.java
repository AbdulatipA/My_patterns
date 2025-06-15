package org.example.my_patterns.abstractFactory;

import org.example.my_patterns.abstractFactory.real.LinuxButton;
import org.example.my_patterns.abstractFactory.real.LinuxWindow;

public class LinuxUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}
