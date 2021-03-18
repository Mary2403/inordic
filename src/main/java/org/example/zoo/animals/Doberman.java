package org.example.zoo.animals;

public class Doberman extends Dog{
    public Doberman(String name, String type, double age) {
        super(name, type, age);
    }

    public Doberman(String name) {
        super(name);
    }

    public Doberman() {
    }

    @Override
    public void eat() {
        System.out.println("Я ем конфеты с глюкозой");
    }

    @Override
    public void beFriend(Animals animals) {
        System.out.println("Дружу с "+ animals.getName());
    }

    @Override
    public void run() {
        System.out.println("Бегаю по сцене");
    }

}
