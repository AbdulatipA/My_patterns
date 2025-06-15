package org.example.my_patterns.facade;

public class FacadeMain {
    public static void main(String[] args) {
        Facade facade = new Facade(new Projector(), new Amplifier(), new DvdPlayer());

        facade.watchMovie("Трансформеры");
    }
}
