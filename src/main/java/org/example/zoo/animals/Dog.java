package org.example.zoo.animals;

public abstract class Dog extends Animals{
    public Dog(String name, String type, double age) {
        super(name, type, age);
    }

    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }
}
