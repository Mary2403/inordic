package org.example.catComparings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cat> catList = Arrays.asList(CatTimosha.getCatTimosha(), CatVasia.getCatVasia());

        Collections.sort(catList );
        catList.forEach(System.out::println);
        System.out.println();

        Collections.sort(catList, new Comparator<Cat>() {
            @Override
            public int compare(Cat cat, Cat t1) {
                return cat.getName().compareTo(t1.getName());
            }
        });
        catList.forEach(System.out::println);
    }

}
