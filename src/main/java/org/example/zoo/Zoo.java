package org.example.zoo;

import org.example.zoo.animals.*;

public class Zoo {
    public static void main(String[] args) {
        Animals coronaBat = new Bat("Корона","bat", 1.4);
        Dog glukozaDoberman = new Doberman("Пес Глюкозы","doberman",10.5);
        Animals goatTimur = new Goat("Тимур", "goat",9.0);
        Dog putinsLabrador = new Labrador("Пес Путина","labrador",6.0);
        Animals octopusPaul = new Octopus("Пауль","octopus", 15.5);
        Animals pinkPony = new Pony("Розовый пони", "octopus", 12.5);
        Animals tigerAmur = new Tiger("Амур", "tiger", 7.5);

        goatTimur.beFriend(pinkPony);
        System.out.println();
        tigerAmur.beFriend(goatTimur);
    }

}
