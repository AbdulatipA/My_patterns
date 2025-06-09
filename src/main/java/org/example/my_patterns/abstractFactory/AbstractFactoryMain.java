package org.example.my_patterns.abstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        UIFactory uiFactory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("windows")) {
            uiFactory = new WindowsUIFactory();
        } else if (osName.contains("mac")) {
            uiFactory = new MacOsUIFactory();
        } else {
            throw new RuntimeException("Неизвестная ОС: " + osName);
        }

        Application app = new Application(uiFactory);

        app.run();
    }
}
