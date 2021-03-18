package org.example.catComparings.version2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Cat implements Comparable<Cat>{
   private String color;
   private Integer age;
   private String name;
   private Kitten kitten;

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
