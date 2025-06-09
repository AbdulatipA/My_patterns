package org.example.my_patterns.abstractFactory;

import org.example.my_patterns.abstractFactory.real.MacOsButton;
import org.example.my_patterns.abstractFactory.real.MacOsWindow;

public class MacOsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Window createWindow() {
        return new MacOsWindow();
    }
}
