package org.example.my_patterns.singleton;

public class Singleton {
    private static Singleton instance;
    private int value;

    public Singleton(int value) {
        this.value = value;
    }

    public Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(this.value);
        }

        return instance;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "Singleton: value = " + this.value;
    }
}
