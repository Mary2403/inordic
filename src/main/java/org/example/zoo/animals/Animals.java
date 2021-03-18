package org.example.zoo.animals;

import org.example.zoo.action.GreetingOfAnimals;
import org.example.zoo.action.Running;

import java.util.Objects;

public abstract class Animals implements GreetingOfAnimals, Running {
    private String name;
    private String type;
    private double age;

    public Animals(String name, String type, double age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public Animals(String name) {
        this.name = name;
    }

    public Animals() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Double.compare(animals.age, age) == 0 && Objects.equals(name, animals.name) && Objects.equals(type, animals.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, age);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
    public abstract void eat();

}
