package org.example.my_patterns.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .setRAM("8 Gb")
                .setCPU("2.2 ggc")
                .build();
    }
}
