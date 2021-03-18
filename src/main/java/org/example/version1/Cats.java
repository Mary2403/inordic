package org.example.catComparings.version1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collections;

@Data
@AllArgsConstructor
public class Cats implements Comparable<Cats>{
    private String color;
    private Integer age;
    private String name;
    private ChildCat childCat;


    @Override
    public int compareTo(Cats cats) {
        if(this.childCat.getAge()> cats.childCat.getAge()){
            return 1;
        }
        else if(this.childCat.getAge()<cats.childCat.getAge()){
            return -1;
        }
        else return 0;
    }
}





