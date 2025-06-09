package org.example.my_patterns.abstractFactory;

public class Application {
    private final Button button;
    private final Window window;

    public Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.window = uiFactory.createWindow();
    }

    public void run(){
        button.render();
        window.open();
    }
}
