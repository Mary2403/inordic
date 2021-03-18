package org.example.zoo.animals;

public class Pony extends Animals{
    public Pony(String name, String type, double age) {
        super(name, type, age);
    }

    public Pony(String name) {
        super(name);
    }

    public Pony() {
    }

    @Override
    public void eat() {
        System.out.println("Ничего не ем");
    }

    @Override
    public void beFriend(Animals animals) {
        System.out.println("Дружу с "+ animals.getName());
    }

    @Override
    public void run() {
        System.out.println("Гуляю в парке по кругу");
    }
}
