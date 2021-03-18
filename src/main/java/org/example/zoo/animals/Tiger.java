package org.example.zoo.animals;

import org.example.zoo.exceptions.NoChoiceFriendException;

public class Tiger extends Animals {
    public Tiger(String name, String type, double age) {
        super(name, type, age);
    }

    public Tiger(String name) {
        super(name);
    }

    public Tiger() {
    }

    @Override
    public void eat() {
        System.out.println("Ем все");
    }

    @Override
    public void beFriend(Animals animals) {
        try {
            if (animals instanceof Goat) {
                throw new NoChoiceFriendException();
            }
            else System.out.println("Я дружу с "+ animals.getName());
        }
        catch (NoChoiceFriendException e){
            System.err.println("С таким животным дружить нельзя");
        }
        finally {
            System.out.println("Я тебя все равно съем");
        }
    }

    @Override
    public void run() {
        System.out.println("Бегаю с козлом по полю");
    }
}
