package org.example.zoo.animals;

import org.example.zoo.exceptions.NoChoiceFriendException;

public class Goat extends Animals{
    public Goat(String name, String type, double age) {
        super(name, type, age);
    }

    public Goat(String name) {
        super(name);
    }

    public Goat() {
    }

    @Override
    public void eat() {
        System.out.println("Я ем траву");
    }

    @Override
    public void beFriend(Animals animals) {
        if(animals instanceof Tiger){
            throw new NoChoiceFriendException("Странная дружба");
        }
        else System.out.println("Дружба навеки с "+ animals.getName());
    }

    @Override
    public void run() {
        System.out.println("Бегаю по полю");
    }
}
