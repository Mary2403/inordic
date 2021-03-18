package org.example.zoo.animals;

import org.example.zoo.exceptions.NoChoiceFriendException;

public class Octopus extends Animals{
    public Octopus(String name, String type, double age) {
        super(name, type, age);
    }

    public Octopus(String name) {
        super(name);
    }

    public Octopus() {
    }


    @Override
    public void eat() {
        System.out.println("Питаюсь водорослями");
    }

    @Override
    public void beFriend(Animals animals) {
        try {
            if(animals instanceof Bat){
                throw new NoChoiceFriendException();
            }
            else System.out.println("Я дружу с "+ animals.getName());
        }
        catch(NoChoiceFriendException e){
            System.err.println("Нельзя дружить с Короной");
        }

    }

    @Override
    public void run() {
        System.out.println("Слежу как бегают другие");
    }

}
