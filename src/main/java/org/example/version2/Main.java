package org.example.catComparings.version2;

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
                return cat.getKitten().getAge().compareTo(t1.getKitten().getAge());
            }
        });
        catList.forEach(System.out::println);
    }

}
