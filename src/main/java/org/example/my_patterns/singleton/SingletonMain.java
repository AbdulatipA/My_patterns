package org.example.my_patterns.singleton;

public class SingletonMain {
    public static void main(String[] args) {
            Singleton singleton = (new Singleton(5)).getInstance();
            Singleton singleton2 = (new Singleton(3)).getInstance();
            System.out.println(singleton == singleton2);
            System.out.println(singleton);
            System.out.println(singleton2);
    }
}
