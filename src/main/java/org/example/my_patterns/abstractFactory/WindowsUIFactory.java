package org.example.my_patterns.abstractFactory;

import org.example.my_patterns.abstractFactory.real.WindowsButton;
import org.example.my_patterns.abstractFactory.real.WindowsWindow;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
