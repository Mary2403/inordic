package org.example.catComparings.version1;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.catComparings.version2.Cat;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingsCatApp {

    public static void main(String[] args) {
        List<Cats> list = Arrays.asList
                (new Cats("orange", 6, "Pushok", new ChildCat("brown", 2,"Pushok1")),
                new Cats("black",4,"Timosha", new ChildCat("yellow", 1, "Timosha1")),
                new Cats("white",5,"Sioma", new ChildCat("green", 3, "Sioma1")));

        Collections.sort(list);
        list.forEach(System.out::println);

        Collections.sort(list, new Comparator<Cats>() {
            @Override
            public int compare(Cats cats, Cats t1) {
                return cats.getChildCat().getEyeColor().compareTo(t1.getChildCat().getEyeColor());
            }
        });
    }

}
