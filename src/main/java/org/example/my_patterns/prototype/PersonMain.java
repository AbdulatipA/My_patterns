package org.example.my_patterns.prototype;

public class PersonMain {
    public static void main(String[] args) {
        Person original = new Person("alex", 22);
        Person clone = (Person) original.clone();

        System.out.println(original);
        System.out.println(clone);

        System.out.println(original == clone);
    }
}
