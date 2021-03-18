package org.example.zoo.animals;

public class Bat extends Animals{
    public Bat(String name, String type, double age) {
        super(name, type, age);
    }

    public Bat(String name) {
        super(name);
    }

    public Bat() {
    }

    @Override
    public void eat() {
        System.out.println("Время поесть");
    }

    @Override
    public void beFriend(Animals animals) {
        System.out.println("Меня зовут "+ this.getName()+ ". А тебя? Я дружу с "+ animals.getName());
    }

    @Override
    public void run() {
        System.out.println("Мне пора");
    }
}
