package org.example.zoo.animals;

public class Labrador extends Dog{
    public Labrador(String name, String type, double age) {
        super(name, type, age);
    }

    public Labrador(String name) {
        super(name);
    }

    public Labrador() {
    }

    @Override
    public void eat() {
        System.out.println("Ем во Дворце");
    }

    @Override
    public void beFriend(Animals animals) {
        System.out.println("Дружу с "+ animals.getName());
    }

    @Override
    public void run() {
        System.out.println("Бегаю по Дворцу");
    }
}
