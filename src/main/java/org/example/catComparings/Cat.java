package org.example.catComparings;

import java.util.Objects;

public abstract class Cat implements Comparable<Cat>{
   private String calor;
   private Integer age;
   private String name;

    public Cat(String calor, Integer age, String name) {
        this.calor = calor;
        this.age = age;
        this.name = name;
    }

    public String getCalor() {
        return calor;
    }

    public void setCalor(String calor) {
        this.calor = calor;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(calor, cat.calor) && Objects.equals(age, cat.age) && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calor, age, name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "calor='" + calor + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        if(this.age> cat.age){
            return 1;
        }
        else if(this.age<cat.age){
            return -1;
        }
        else return 0;
    }
}
